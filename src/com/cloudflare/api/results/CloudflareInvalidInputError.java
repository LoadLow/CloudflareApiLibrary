package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareInvalidInputError extends CloudflareError {

    public CloudflareInvalidInputError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
