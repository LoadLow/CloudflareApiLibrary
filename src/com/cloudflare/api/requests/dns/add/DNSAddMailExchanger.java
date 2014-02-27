package com.cloudflare.api.requests.dns.add;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.RecordType;
import com.cloudflare.api.requests.dns.DNSAddRecord;
import com.cloudflare.api.utils.TimeUnit;

/**
 *
 * @author LoadLow
 */
public class DNSAddMailExchanger extends DNSAddRecord {

    public DNSAddMailExchanger(CloudflareAccess api, String targetDomain, String recordName, String handledBy, int priority) {
        super(api, targetDomain, RecordType.MailExchanger, recordName, handledBy);
        add("prio", Integer.toString(priority));
    }

    public DNSAddMailExchanger(CloudflareAccess api, String targetDomain, String recordName, String handledBy, int priority, TimeUnit recordTTL) {
        super(api, targetDomain, RecordType.MailExchanger, recordName, handledBy, recordTTL);
        add("prio", Integer.toString(priority));
    }
}