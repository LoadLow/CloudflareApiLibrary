package com.cloudflare.api.requests.modify;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.MinifyOption;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ModifyMinifyLevel extends CloudflareRequest {

    public ModifyMinifyLevel(CloudflareAccess api, String domain, MinifyOption option) {
        super(api, CloudflareValue.MinifyMode);
        add("z", domain);
        add("v", option.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}