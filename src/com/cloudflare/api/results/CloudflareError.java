package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareError extends Exception {

    public CloudflareError(String flag, String globalMessage, String message) {
        super("[" + flag + "] : " + globalMessage + " :: " + message);
    }
}
