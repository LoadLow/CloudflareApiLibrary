package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareMaxRequestsError extends CloudflareError {

    public CloudflareMaxRequestsError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
