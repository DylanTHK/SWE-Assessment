package mail;

import java.io.*;
import java.util.*;

public class Main {
    private static String[] keys;
    private static List<Person> people = new ArrayList<Person>(); 
    public static void main(String[] args) throws Exception {
        // assume args are keyed in 
        args = "thankyou.csv thankyou.txt".split(" ");
        String csvFile = "task01/src/mail/" + args[0]; //****$$ EDIT to detect args
        String txtFile = "task01/src/mail/" + args[1]; //****$$ EDIT

        
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
                people.add(person);
                person.viewMap(); //****$$ REMOVE
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }

 
        // reader for txt file 
        // try {
        //     FileReader fr = new FileReader(txtFile); // reading txt file
        //     BufferedReader br = new BufferedReader(fr);
        //     String lines = br.lines().;

        // } catch (FileNotFoundException e) {
        //     e.getStackTrace();
        // } catch (IOException e) {
        //     e.getStackTrace();
        // }


        // store Person instances in linkedlist

        // for each person, replace the text in << >> with values
        

    }

    public static void printTxt() {

    }
}
