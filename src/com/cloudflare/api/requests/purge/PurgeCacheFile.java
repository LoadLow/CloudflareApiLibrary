package com.cloudflare.api.requests.purge;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class PurgeCacheFile extends CloudflareRequest {

    public PurgeCacheFile(CloudflareAccess api, String domain, String FileURL) {
        super(api, CloudflareValue.PurgeCacheFile);
        add("z", domain);
        add("url", FileURL);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}
