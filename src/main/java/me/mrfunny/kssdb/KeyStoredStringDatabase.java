package me.mrfunny.kssdb;

import me.mrfunny.kssdb.internal.KeyStoredStringDatabaseImpl;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public interface KeyStoredStringDatabase {
    void read(File databaseFolder, boolean gcAfter) throws IOException;
    String get(String key) throws IOException;
    Collection<String> getAll(String key) throws IOException;

    void set(String key, String data) throws IOException;
    void set(Map<String, String> bulkSet) throws IOException;

    EditSession newEditSession();

    boolean containsKey(String key);

    static KeyStoredStringDatabase newClient() {
        return new KeyStoredStringDatabaseImpl();
    }

    static KeyStoredStringDatabase newClient(File folder) throws IOException {
        KeyStoredStringDatabaseImpl db = new KeyStoredStringDatabaseImpl();
        db.read(folder, false);
        return db;
    }
}
