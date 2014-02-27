package com.cloudflare.api.requests.dns;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddRecord extends CloudflareRequest {

    public DNSAddRecord(CloudflareAccess api, String targetDomain, RecordType recordType, String recordName, String recordContent) {
        super(api, CloudflareValue.DNSAddRecord);
        add("z", targetDomain);
        add("type", recordType.opt);
        add("name", recordName);
        add("content", recordContent);
        add("ttl", "1");
    }

    public DNSAddRecord(CloudflareAccess api, String targetDomain, RecordType recordType, String recordName, String recordContent, TimeUnit recordTTL) {
        super(api, CloudflareValue.DNSAddRecord);
        add("z", targetDomain);
        add("type", recordType.opt);
        add("name", recordName);
        add("content", recordContent);
        add("ttl", Long.toString(recordTTL.to(TimeUnit.UnitType.SECONDS)));
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}
