package me.mrfunny.kssdb;

import me.mrfunny.kssdb.internal.DatabaseKey;
import me.mrfunny.kssdb.internal.KeyStoredStringDatabaseImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface KeyStoredStringDatabase {
    void read(File databaseFolder, boolean gcAfter) throws IOException;
    String get(String key) throws IOException;
    List<String> getAll(String key) throws IOException;

    void set(String key, String data) throws IOException;
    void set(Map<String, String> bulkSet) throws IOException;

    List<DatabaseKey> keys();

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
