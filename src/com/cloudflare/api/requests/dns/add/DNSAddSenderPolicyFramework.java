package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddSenderPolicyFramework extends DNSAddRecord {

    public DNSAddSenderPolicyFramework(CloudflareAccess api, String targetDomain, String SPFRecord, String recordName) {
        super(api, targetDomain, RecordType.SenderPolicyFramework, recordName, SPFRecord);
    }

    public DNSAddSenderPolicyFramework(CloudflareAccess api, String targetDomain, String SPFRecord, String recordName, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.SenderPolicyFramework, recordName, SPFRecord, recordTTL);
    }
}
