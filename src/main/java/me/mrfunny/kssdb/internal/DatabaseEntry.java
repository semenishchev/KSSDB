package me.mrfunny.kssdb.internal;

public class DatabaseEntry {
    private final String key;
    private final long position;

    public DatabaseEntry(String key, long position) {
        this.key = key;
        this.position = position;
    }

    public String getKey() {
        return key;
    }

    public long getPosition() {
        return position;
    }
}
