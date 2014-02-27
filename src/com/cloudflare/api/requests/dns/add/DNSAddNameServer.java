package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddNameServer extends DNSAddRecord {

    public DNSAddNameServer(CloudflareAccess api, String targetDomain, String DNS, String recordName) {
        super(api, targetDomain, RecordType.NameServer, recordName, DNS);
    }

    public DNSAddNameServer(CloudflareAccess api, String targetDomain, String DNS, String recordName, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.NameServer, recordName, DNS, recordTTL);
    }
}
