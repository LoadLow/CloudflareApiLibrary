package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum ServiceProtocol {

    UDP("_udp"),
    TCP("_tcp"),
    TLS("_tls");
    public final String opt;

    private ServiceProtocol(String opt) {
        this.opt = opt;
    }
}
