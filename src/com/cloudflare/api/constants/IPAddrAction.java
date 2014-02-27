package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum IPAddrAction {

    Whitelist("wl"),
    Blacklist("ban"),
    Unlist("nul");
    public final String opt;

    private IPAddrAction(String opt) {
        this.opt = opt;
    }
}
