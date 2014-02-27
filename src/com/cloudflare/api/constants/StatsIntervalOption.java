package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum StatsIntervalOption {

    PAST_30_DAYS("20"),
    PAST_7_DAYS("30"),
    PAST_DAY("40"),
    PRO_24H_AGO("100"),
    PRO_12H_AGO("110"),
    PRO_6H_AGO("120");
    public final String opt;

    private StatsIntervalOption(String opt) {
        this.opt = opt;
    }
}
