package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum MinifyOption {

    NONE("0"),
    JS("1"),
    CSS("2"),
    JS_CSS("3"),
    HTML("4"),
    JS_HTML("5"),
    CSS_HTML("6"),
    ALL("7");
    public final String opt;

    private MinifyOption(String opt) {
        this.opt = opt;
    }
}
