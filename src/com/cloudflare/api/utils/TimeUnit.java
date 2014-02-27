package com.cloudflare.api.utils;

/**
 *
 * @author LoadLow
 */
public class TimeUnit {

    public static enum UnitType {

        MILLISECONDS,
        SECONDS,
        MINUTES,
        HOURS,
        DAYS;
    }
    private UnitType type;
    private long value;

    public TimeUnit(UnitType type, long value) {
        this.type = type;
        this.value = value;
    }

    public long to(UnitType toConvert) {
        if (value == 0) {
            return 0;
        }
        switch (toConvert) {
            case SECONDS:
                return toSeconds();
            case MINUTES:
                return toMinutes();
            case HOURS:
                return toHours();
            case DAYS:
                return toDays();
            case MILLISECONDS:
            default:
                return toMillis();
        }
    }

    private long toMillis() {
        switch (type) {
            case SECONDS:
                return value * 1000;
            case MINUTES:
                return value * 60000;
            case HOURS:
                return value * 3600 * 1000;
            case DAYS:
                return value * 24 * 3600 * 1000;
            case MILLISECONDS:
            default:
                return value;
        }
    }

    private long toSeconds() {
        switch (type) {
            case SECONDS:
                return value;
            case MINUTES:
                return value * 60;
            case HOURS:
                return value * 3600;
            case DAYS:
                return value * 24 * 3600;
            case MILLISECONDS:
            default:
                return value / 1000;
        }
    }

    private long toMinutes() {
        switch (type) {
            case SECONDS:
                return value / 60;
            case MINUTES:
                return value;
            case HOURS:
                return value * 60;
            case DAYS:
                return value * 24 * 60;
            case MILLISECONDS:
            default:
                return value / 60000;
        }
    }

    private long toHours() {
        switch (type) {
            case SECONDS:
                return value / 3600;
            case MINUTES:
                return value / 60;
            case HOURS:
                return value;
            case DAYS:
                return value * 24;
            case MILLISECONDS:
            default:
                return value / (3600 * 1000);
        }
    }

    private long toDays() {
        switch (type) {
            case SECONDS:
                return value / (3600 * 24);
            case MINUTES:
                return value / (60 * 24);
            case HOURS:
                return value / 24;
            case DAYS:
                return value;
            case MILLISECONDS:
            default:
                return value / (3600 * 1000 * 24);
        }
    }

    public long get() {
        return value;
    }

    public UnitType type() {
        return type;
    }
}
