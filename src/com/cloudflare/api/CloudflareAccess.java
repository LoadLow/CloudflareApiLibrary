package com.cloudflare.api;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author LoadLow
 */
public class CloudflareAccess {

    private String tkn;
    private String email;
    private HttpClient client = new DefaultHttpClient();
    public final static String CF_API_LINK = "https://www.cloudflare.com/api_json.html";

    public CloudflareAccess(String mail, String APIkey) {
        this.email = mail;
        this.tkn = APIkey;
    }

    public String getToken() {
        return tkn;
    }

    public String getEmail() {
        return email;
    }

    public HttpClient getClient() {
        return client;
    }
}
