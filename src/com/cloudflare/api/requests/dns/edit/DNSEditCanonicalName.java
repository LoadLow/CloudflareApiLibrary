package com.cloudflare.api.requests.dns.edit;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.EnableOption;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSEditRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSEditCanonicalName extends DNSEditRecord {

    public DNSEditCanonicalName(CloudflareAccess api, String targetDomain, int recordID, String alias, String toDomain, EnableOption proxyFilterStatus) {
        super(api, targetDomain, recordID, RecordType.CanonicalName, alias, toDomain);
        add("service_mode", proxyFilterStatus.opt);
    }

    public DNSEditCanonicalName(CloudflareAccess api, String targetDomain, int recordID, String alias, String toDomain, EnableOption proxyFilterStatus, TimeUnit recordTTL) {
        super(api, targetDomain, recordID, RecordType.CanonicalName, alias, toDomain, recordTTL);
        add("service_mode", proxyFilterStatus.opt);
    }
}
