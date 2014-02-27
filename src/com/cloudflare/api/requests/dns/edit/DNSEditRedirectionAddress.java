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
public class DNSEditRedirectionAddress extends DNSEditRecord {

    public DNSEditRedirectionAddress(CloudflareAccess api, String targetDomain, int recordID, String toIP, String recordName, EnableOption proxyFilterStatus) {
        super(api, targetDomain, recordID, RecordType.IPV4Address, recordName, toIP);
        add("service_mode", proxyFilterStatus.opt);
    }

    public DNSEditRedirectionAddress(CloudflareAccess api, String targetDomain, int recordID, String toIP, String recordName, EnableOption proxyFilterStatus, boolean IPV6) {
        super(api, targetDomain, recordID, IPV6 ? (RecordType.IPV6Address) : (RecordType.IPV4Address), recordName, toIP);
        add("service_mode", proxyFilterStatus.opt);
    }

    public DNSEditRedirectionAddress(CloudflareAccess api, String targetDomain, int recordID, String toIP, String recordName, EnableOption proxyFilterStatus, TimeUnit recordTTL) {
        super(api, targetDomain, recordID, RecordType.IPV4Address, recordName, toIP, recordTTL);
        add("service_mode", proxyFilterStatus.opt);
    }

    public DNSEditRedirectionAddress(CloudflareAccess api, String targetDomain, int recordID, String toIP, String recordName, EnableOption proxyFilterStatus, TimeUnit recordTTL, boolean IPV6) {
        super(api, targetDomain, recordID, IPV6 ? (RecordType.IPV6Address) : (RecordType.IPV4Address), recordName, toIP, recordTTL);
        add("service_mode", proxyFilterStatus.opt);
    }
}
