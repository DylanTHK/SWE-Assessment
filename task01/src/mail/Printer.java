package mail;

import java.util.*;

public class Printer {

    public static void printAll(List<Person> list, List<String> message) {
        // loop for each person in List
        // list.size()
        for (int p = 0; p < 1; p++) {
            Person target = list.get(p);
            Set<String> keySet = target.getKeySet();
            List<String> newMessage = message; // does assigning array to variable create a copy?

            for (int l = 0; l < newMessage.size(); l++) { // loop for every line in newMessage
                String line = newMessage.get(l);
                // check for \n
                if (line.length() <= 0) {
                    System.out.println(line);
                } else {
                    // // check if message line contains element in setKey
                    for (String key : keySet) {
                        if (line.contains(key)) {
                            // conduct replace old string(key) with new string(value)
                            String value = target.getValue(key);
                            String newLine = line.replaceAll(key, value);
                            System.out.println(newLine);
                        }
                    } // for 3

                } // if else
            } // for 2
        } // for 1
    } // printAll()
} // class
