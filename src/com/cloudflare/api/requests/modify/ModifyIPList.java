package com.cloudflare.api.requests.modify;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.IPAddrAction;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ModifyIPList extends CloudflareRequest {

    public ModifyIPList(CloudflareAccess api, IPAddrAction IPaction, String IPAddr) {
        super(api, IPaction.opt);
        add("key", IPAddr);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}