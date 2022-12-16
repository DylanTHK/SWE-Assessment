package mail;

import java.util.*;

public class Person {
    private Map<String, String> details = new HashMap<String, String>();
    // read template and store in array
    private String[] keys;
    private String line;

    public Person(String[] keys, String line) {
        this.keys = keys;
        this.line = line;
    }

    // populate hashmap
    public void addHashMap() {
        String[] values = line.trim().split(",");
        for (int i = 0; i < values.length; i++) {
            String formattedKey = String.format("<%s>",keys[i]);
            details.put(formattedKey, values[i]);
        }
    }

    // get values from hashmap
    public String getValue(String key) {
        String value = details.get(key);
        return value;
    }

    public void viewMap() {
        System.out.println("Person HashMap: " + details); //****$$ REMOVE
    }
}
