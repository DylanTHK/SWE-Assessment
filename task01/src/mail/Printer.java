package mail;

import java.util.*;

public class Printer {

    public static void printAll(List<Person> list, List<String> message) {
        for (int p = 0; p < list.size(); p++) {
            Person target = list.get(p); 
            Set<String> keySet = target.getKeySet(); 
            List<String> newMessage = message; 

            // cleaning line in newMessage and printing
            for (int l = 0; l < newMessage.size(); l++) { 
                String line = newMessage.get(l);

                if (line.length() <= 0) { // checks for valid lines
                    System.out.println(line);
                } else { // check valid lines message line contains element in setKey
                    for (String key : keySet) {
                        // replace old string(key) with new string(value)
                        if (line.contains(key)) {
                            String value = target.getValue(key);
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
