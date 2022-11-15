# KSSDB
Key Stored String Database

## The best database for logs
- - -
A quick example
```java
import java.io.File;

public class Test {
    public static void main(String[] args) {
        KeyStoredStringDatabase database = KeyStoredStringDatabase.newClient(new File("database"));
        database.set("hello", "world");
        System.out.println(database.get("hello")); // prints out world
    }
}
```
When you need to write many strings at once, you can use EditSession or just put the strings in the map
```java
import java.io.File;

public class Test {
    public static void main(String[] args) {
        KeyStoredStringDatabase database = KeyStoredStringDatabase.newClient(new File("database"));
        EditSession session = database.newEditSession();
        session.set("Hello", "World");
        session.set("123", "456");
        session.set("test", "this is a test");
        session.remove("test"); // `test` key won't be applied
        session.apply();
        System.out.println(database.get("hello")); // world
        System.out.println(database.get("123")); // 456
        System.out.println(database.get("test")); // null
    }
}
```
# File specifications
## a guide to the format of files, or how to write own wrapper for this database
```soon```