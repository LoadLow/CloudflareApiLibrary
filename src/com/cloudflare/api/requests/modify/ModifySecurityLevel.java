package com.cloudflare.api.requests.modify;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.SecurityLevel;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ModifySecurityLevel extends CloudflareRequest {

    public ModifySecurityLevel(CloudflareAccess api, String domain, SecurityLevel level) {
        super(api, CloudflareValue.SecurityLevel);
        add("z", domain);
        add("v", level.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}