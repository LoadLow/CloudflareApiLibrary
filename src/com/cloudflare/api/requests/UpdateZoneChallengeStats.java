package com.cloudflare.api.requests;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class UpdateZoneChallengeStats extends CloudflareRequest {

    public UpdateZoneChallengeStats(CloudflareAccess api, int zoneID) {
        super(api, CloudflareValue.UpdateZoneChallengeStats);
        add("zid", Integer.toString(zoneID));
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}