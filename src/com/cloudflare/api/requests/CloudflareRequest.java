package com.cloudflare.api.requests;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.results.CloudflareError;
import com.cloudflare.api.results.CloudflareErrorEnum;
import com.cloudflare.api.results.CloudflareResult;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author LoadLow
 */
public class CloudflareRequest implements Closeable {

    private List<NameValuePair> post_values = new ArrayList<NameValuePair>();
    private CloudflareAccess api;

    public CloudflareRequest(CloudflareAccess api) {
        this.api = api;
        add("tkn", api.getToken());
        add("email", api.getEmail());
    }

    public CloudflareRequest(CloudflareAccess api, CloudflareValue action) {
        this(api);
        add("a", action.opt);
    }

    public CloudflareRequest(CloudflareAccess api, String action) {
        this(api);
        add("a", action);
    }

    public void add(String key, String value) {
        post_values.add(new BasicNameValuePair(key,
                value));
    }

    public JSONObject executeBasic() throws CloudflareError {
        try {
            HttpPost post = new HttpPost(
                    CloudflareAccess.CF_API_LINK);
            post.setEntity(new UrlEncodedFormEntity(post_values));

            HttpResponse response = api.getClient().execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            StringBuilder sbResult = new StringBuilder();
            String line = null;
            while ((line = rd.readLine()) != null) {
                sbResult.append(line);
            }
            line = null;

            JSONObject jsonResult = (JSONObject) JSONSerializer.toJSON(
                    sbResult.toString());
            sbResult = null;


            if (!jsonResult.containsKey("result")) {
                throw new CloudflareError("no_result", "No result received", "Result=null");
            }

            CloudflareResult result = CloudflareResult.valueOf(jsonResult.getString(
                    "result"));

            switch (result) {
                case success: {
                    if (jsonResult.containsKey("response")) {
                        return jsonResult.getJSONObject("response");
                    } else {
                        return jsonResult;
                    }
                }
                case error: {
                    String errMessage = "(no message in response)";
                    if (jsonResult.containsKey("msg")) {
                        errMessage = jsonResult.getString("msg");
                    }
                    String errCode = CloudflareErrorEnum.UNKNOWN_ERROR.toString();
                    if (jsonResult.containsKey("err_code")) {
                        errCode = jsonResult.getString("err_code");
                    }
                    throw CloudflareErrorEnum
                        .valueOf(errCode)
                        .getException(errMessage);
                }
            }

        } catch (IOException e) {
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        if (post_values != null) {
            post_values.clear();
        }
        post_values = null;
        api = null;
        try {
            this.finalize();
        } catch (Throwable tr) {
        }
    }
}
