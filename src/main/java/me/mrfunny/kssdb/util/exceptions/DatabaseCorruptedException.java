package me.mrfunny.kssdb.util.exceptions;

import java.io.IOException;

public class DatabaseCorruptedException extends IOException {
    public DatabaseCorruptedException() {
        super("The database is corrupted");
    }
}
