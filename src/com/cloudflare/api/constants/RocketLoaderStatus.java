package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum RocketLoaderStatus {

    off("0"),
    automatic("a"),
    manual("m");
    public final String opt;

    private RocketLoaderStatus(String opt) {
        this.opt = opt;
    }
}
