package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddText extends DNSAddRecord {

    public DNSAddText(CloudflareAccess api, String targetDomain, String Text, String recordName) {
        super(api, targetDomain, RecordType.Text, recordName, Text);
    }

    public DNSAddText(CloudflareAccess api, String targetDomain, String Text, String recordName, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.Text, recordName, Text, recordTTL);
    }
}
