package com.cloudflare.api.requests.modify;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.RocketLoaderStatus;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ModifyRocketLoaderStatus extends CloudflareRequest {

    public ModifyRocketLoaderStatus(CloudflareAccess api, String domain, RocketLoaderStatus option) {
        super(api, CloudflareValue.RocketLoader);
        add("z", domain);
        add("v", option.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}