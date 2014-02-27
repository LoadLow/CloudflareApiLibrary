package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddLocalisation extends DNSAddRecord {

    public DNSAddLocalisation(CloudflareAccess api, String targetDomain, String LocRecordValue, String recordName) {
        super(api, targetDomain, RecordType.Localisation, recordName, LocRecordValue);
    }

    public DNSAddLocalisation(CloudflareAccess api, String targetDomain, String LocRecordValue, String recordName, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.Localisation, recordName, LocRecordValue, recordTTL);
    }
}
