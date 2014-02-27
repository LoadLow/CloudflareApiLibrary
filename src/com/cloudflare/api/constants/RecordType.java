package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum RecordType {

    IPV4Address("A"),
    IPV6Address("AAAA"),
    CanonicalName("CNAME"),
    MailExchanger("MX"),
    Text("TXT"),
    NameServer("NS"),
    //ServiceSupport("SRV"), //missing infos on cloudflare doc'
    SenderPolicyFramework("SPF"),
    Localisation("LOC");
    public final String opt;

    private RecordType(String opt) {
        this.opt = opt;
    }
}
