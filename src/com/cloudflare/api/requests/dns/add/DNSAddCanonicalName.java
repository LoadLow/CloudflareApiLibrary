package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddCanonicalName extends DNSAddRecord {

    public DNSAddCanonicalName(CloudflareAccess api, String targetDomain, String alias, String toDomain) {
        super(api, targetDomain, RecordType.CanonicalName, alias, toDomain);
    }

    public DNSAddCanonicalName(CloudflareAccess api, String targetDomain, String alias, String toDomain, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.CanonicalName, alias, toDomain, recordTTL);
    }
}
