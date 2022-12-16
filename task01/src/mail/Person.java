package mail;

import java.util.*;

public class Person {
    private Map<String, String> details = new HashMap<String, String>();
    // read template and store in array
    private String[] key;
    private String line;

    public Person(String[] key, String line) {
        this.key = key;
        this.line = line;
    }

    public void addHashMap() {
        String[] values = line.trim().split(" ");
        
    }

    public void viewMap() {
        System.out.println(details);
    }
}
