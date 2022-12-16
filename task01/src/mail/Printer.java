package mail;

import java.util.*;

public class Printer {

    public static void printAll(List<Person> list, List<String> message) {
        // loop for each person in List
        // list.size()
        for (int p = 0; p < list.size(); p++) {
            Person target = list.get(p); // target -> Person instance
            Set<String> keySet = target.getKeySet(); // Hashmap from Person instance
            List<String> newMessage = message; // does assigning array to variable create a copy?

            for (int l = 0; l < newMessage.size(); l++) { // loop for every line in newMessage
                String line = newMessage.get(l); // line is newly selected line
                // System.out.println(l + ": " + line);
                // check for \n
                if (line.length() <= 0) { // checks for valid lines
                    System.out.println(line);
                } else { // check valid lines message line contains element in setKey
                    for (String key : keySet) {
                        if (line.contains(key)) {
                            // conduct replace old string(key) with new string(value)
                            String value = target.getValue(key);
                            // troubleshooting
                            // System.out.println("Key: " + key);
                            // System.out.println("Value: " + value);
                            // System.out.printf("Value2: %s\n", value);

                            line = line.replace(key, value);
                        }
                    } // for 3
                    // printing editted line
                    if (line.contains("\\n")) {
                        String[] array = line.split("\\\\n");
                        for (String s : array) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println(line);
                    }
                } // if else
            } // for 2
        } // for 1
    } // printAll()
} // class
