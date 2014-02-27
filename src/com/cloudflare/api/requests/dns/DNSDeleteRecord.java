package com.cloudflare.api.requests.dns;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.requests.CloudflareRequest;

/**
 *
 * @author LoadLow
 */
public class DNSDeleteRecord extends CloudflareRequest {

    public DNSDeleteRecord(CloudflareAccess api, String targetDomain, int RecordID) {
        super(api, CloudflareValue.DNSRemoveRecord);
        add("z", targetDomain);
        add("id", Integer.toString(RecordID));
    }
}
