package com.cloudflare.api.requests.modify;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CacheLevel;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ModifyCacheLevel extends CloudflareRequest {

    public ModifyCacheLevel(CloudflareAccess api, String domain, CacheLevel option) {
        super(api, CloudflareValue.CacheLevel);
        add("z", domain);
        add("v", option.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}