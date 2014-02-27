package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum IPV6Option {

    Off("0"),
    Full("3"),
    Safe("2");
    public final String opt;

    private IPV6Option(String opt) {
        this.opt = opt;
    }
}
