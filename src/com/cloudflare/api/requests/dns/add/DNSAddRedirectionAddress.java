package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddRedirectionAddress extends DNSAddRecord {

    public DNSAddRedirectionAddress(CloudflareAccess api, String targetDomain, String toIP, String recordName) {
        super(api, targetDomain, RecordType.IPV4Address, recordName, toIP);
    }

    public DNSAddRedirectionAddress(CloudflareAccess api, String targetDomain, String toIP, String recordName, boolean IPV6) {
        super(api, targetDomain, IPV6 ? (RecordType.IPV6Address) : (RecordType.IPV4Address), recordName, toIP);
    }

    public DNSAddRedirectionAddress(CloudflareAccess api, String targetDomain, String toIP, String recordName, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.IPV4Address, recordName, toIP, recordTTL);
    }

    public DNSAddRedirectionAddress(CloudflareAccess api, String targetDomain, String toIP, String recordName, TimeUnit recordTTL, boolean IPV6) {
        super(api, targetDomain, IPV6 ? (RecordType.IPV6Address) : (RecordType.IPV4Address), recordName, toIP, recordTTL);
    }
}
