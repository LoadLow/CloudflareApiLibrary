package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum SSLStatus {

    Off("0"),
    Flexible("1"),
    Full("2");
    public final String opt;

    private SSLStatus(String opt) {
        this.opt = opt;
    }
}
