package me.mrfunny;

import me.mrfunny.kssdb.KeyStoredStringDatabase;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {
    @Test
    public void testValue() throws IOException {
        KeyStoredStringDatabase database = KeyStoredStringDatabase.newClient(new File("database"));
//        database.set("test_0129", "привет мир hello world");
        database.set("test_0129", "пока мир");
    }

    @Test
    public void testGet() throws IOException {
        KeyStoredStringDatabase database = KeyStoredStringDatabase.newClient(new File("database"));
        assertEquals("value", database.get("test_123"));
        assertEquals("test", database.get("test_qwe"));
        assertEquals("hello world", database.get("test_012"));
        List<String> all = database.getAll("test_0129");
        System.out.println(all);
        assertEquals("привет мир hello world", all.get(0));
        assertEquals("пока мир", all.get(2));
    }

    @Test
    public void testBareCreation() throws IOException {
        File folder = new File("idkhowtocallthat");
        KeyStoredStringDatabase database = KeyStoredStringDatabase.newClient(folder);
        assertTrue(folder.exists());
    }
}
