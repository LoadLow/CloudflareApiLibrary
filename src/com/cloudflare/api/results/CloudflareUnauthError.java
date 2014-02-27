package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareUnauthError extends CloudflareError {

    public CloudflareUnauthError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
