package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum SecurityLevel {

    ImUnderAttack("help"),
    High("high"),
    Medium("med"),
    Low("low"),
    EssentiallyOff("eoff");
    public final String opt;

    private SecurityLevel(String opt) {
        this.opt = opt;
    }
}
