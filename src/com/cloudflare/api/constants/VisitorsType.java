package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum VisitorsType {

    Regular("r"),
    Crawler("s"),
    Threat("t");
    public final String opt;

    private VisitorsType(String opt) {
        this.opt = opt;
    }
}
