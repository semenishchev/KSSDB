package me.mrfunny;

import me.mrfunny.kssdb.KeyStoredStringDatabase;
import me.mrfunny.kssdb.internal.DatabaseKey;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class DatabaseTest {
    @Test
    public void testValueInsert() throws IOException {
        KeyStoredStringDatabase db = KeyStoredStringDatabase.newClient(new File("testdatabase"));
        for (int i = 0; i < 100; i++) {
            db.set(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        }
    }

    @Test
    public void testValueGet() throws IOException {
        KeyStoredStringDatabase db = KeyStoredStringDatabase.newClient(new File("testdatabase"));
        for (DatabaseKey key : db.keys()) {
            System.out.println(db.get(key));
        }
    }
}
