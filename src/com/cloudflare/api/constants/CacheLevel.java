package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum CacheLevel {

    Aggressive("agg"),
    Basic("basic");
    public final String opt;

    private CacheLevel(String opt) {
        this.opt = opt;
    }
}
