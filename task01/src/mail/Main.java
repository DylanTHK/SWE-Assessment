package mail;

import java.io.*;
import java.util.*;


public class Main {
    // class members
    private static String[] keys;
    private static List<Person> people = new ArrayList<Person>();
    private static List<String> message; 

    public static void main(String[] args) {
        // assume no error in args
        // args = "thankyou.csv thankyou.txt".split(" "); //****$$ REMOVE to detect args
        String csvFile = args[0]; 
        String txtFile = args[1]; 
        
        // reader for csv file
        try {
            FileReader fr = new FileReader(csvFile);
            BufferedReader br = new BufferedReader(fr);
            keys = br.readLine().trim().split(",");
            String line;
            while ((line = br.readLine()) != null) {
                // create Person class to store values and name (value name pair hashmap)
                Person person = new Person(keys, line);
                person.addHashMap();
                people.add(person); // store Person instances in linkedlist
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }

 
        // reader for txt file 
        try {
            FileReader fr = new FileReader(txtFile); // reading txt file
            BufferedReader br = new BufferedReader(fr);
            message = br.lines().toList();
            
            br.close();

        } catch (IOException e) {
            e.getStackTrace();
        }

        // calls printer class to print all relevant information
        Printer.printAll(people, message);

    } // main
} // class
