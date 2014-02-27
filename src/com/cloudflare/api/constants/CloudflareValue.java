package com.cloudflare.api.constants;

/**
 *
 * @author LoadLow
 */
public enum CloudflareValue {

    DevelopmentStatus("dev_mode"),
    AlwaysOnlineStatus("ob"),
    TTLChallenge("ch_ttl"),
    TTLExpire("exp_ttl"),
    SecurityLevel("sec_lvl"),
    CacheLevel("cache_lvl"),
    RocketLoader("async"),
    MinifyMode("minify"),
    IPV6("ipv46"),
    BrowserIntegrityCheck("bic"),
    EmailFilter("email_filter"),
    ServerSideExclude("sse"),
    HotlinkProtection("hotlink"),
    IPGeolocation("geoloc"),
    PurgeCache("fpurge_ts"),
    PurgeCacheFile("zone_file_purge"),
    UpdateZoneChallengeStats("zone_grab"),
    PRO_SPDY("spdy"),
    PRO_SSL("ssl"),
    PRO_LazyLoad("lazy"),
    PRO_AutoresizeImg("img"),
    PRO_Preloader("preload"),
    PRO_WAFirewall("waf_profile"),
    DNSAddRecord("rec_new"),
    DNSEditRecord("rec_edit"),
    DNSRemoveRecord("rec_delete");
    public final String opt;

    private CloudflareValue(String opt) {
        this.opt = opt;
    }
}
