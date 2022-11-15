package me.mrfunny.kssdb;

import java.io.IOException;
import java.util.Map;

public interface EditSession {
    EditSession set(String key, String value) throws UnsupportedOperationException;
    void bulkSet(Map<String, String> theMap) throws UnsupportedOperationException;
    void remove(String key) throws UnsupportedOperationException;
    void apply() throws UnsupportedOperationException, IOException;
}
