package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum WAFirewallProfile {

    High("high"),
    Low("low"),
    Off("off");
    public final String opt;

    private WAFirewallProfile(String opt) {
        this.opt = opt;
    }
}
