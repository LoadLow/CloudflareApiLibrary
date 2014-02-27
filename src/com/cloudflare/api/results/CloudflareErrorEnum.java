package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public enum CloudflareErrorEnum {

    E_UNAUTH {
        @Override
        public CloudflareError getException(String msg) {
            return new CloudflareUnauthError(this.name(),
                    "Authentication could not be completed", msg);
        }
    },
    E_INVLDINPUT {
        @Override
        public CloudflareError getException(String msg) {
            return new CloudflareInvalidInputError(this.name(),
                    "Some other input was not valid", msg);
        }
    },
    ip {
        @Override
        public CloudflareError getException(String msg) {
            return new CloudflareInvalidInputError(this.name(),
                    "Some other input was not valid",
                    msg);
        }
    },
    v {
        @Override
        public CloudflareError getException(String msg) {
            return new CloudflareInvalidInputError(this.name(),
                    "Some other input was not valid",
                    msg);
        }
    },
    E_MAXAPI {
        @Override
        public CloudflareError getException(String msg) {
            return new CloudflareMaxRequestsError(this.name(),
                    "You have exceeded your allowed number of API calls.",
                    msg);
        }
    };

    public abstract CloudflareError getException(String msg);
}
