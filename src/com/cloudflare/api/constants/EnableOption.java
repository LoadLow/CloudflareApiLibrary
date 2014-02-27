package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum EnableOption {

    on("1"),
    off("0");
    public final String opt;

    private EnableOption(String opt) {
        this.opt = opt;
    }
}
