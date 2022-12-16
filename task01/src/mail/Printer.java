package mail;

import java.util.*;

public class Printer {

    public static void printAll(List<Person> list, List<String> message) {
        // loop for each person in List
        // list.size()
        for (int p = 0; p < 1; p++) {
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
                            line = line.replaceAll(key, value);
                        }
                    } // for 3
                    System.out.println(line);

                } // if else
            } // for 2
        } // for 1
    } // printAll()
} // class
