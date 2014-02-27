package com.cloudflare.api.requests.purge;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.EnableOption;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class PurgeCache extends CloudflareRequest {

    public PurgeCache(CloudflareAccess api, String domain) {
        super(api, CloudflareValue.PurgeCache);
        add("z", domain);
        add("v", EnableOption.on.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}