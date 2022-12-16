package task02.calculator;


import static task02.calculator.Operators.*;

import java.util.*;

public class Main {

    private static Integer lastValue = 0; // holds value for $Last
    private static Boolean stop = false;
    public static void main(String[] args) {
        System.out.println("Welcome.");
        
        Scanner scanner = new Scanner(System.in);
        while (true){
            // 1. scan
            String line = scanner.nextLine(); // scan next line
            String[] el = line.split(" "); // break input into array
            
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                break;
            }
            // 2. clean
            Integer value1 = validateValue(el[0]);
            Integer value2 = validateValue(el[2]);
            String operator = el[1];
            
            // 3. compute
            Integer result = computeResults(operator, value1, value2);
            
            // 4. print results
            System.out.println("value1: " + value1);
            System.out.println("value2: " + value2);
            System.out.println("results: " + result);
            System.out.println("lastvalue: " + lastValue);

        }
        
        
        
        // // CALL method to validate values
        // System.out.println("$last = " + lastValue);

    } //psvm

    // method to validate value (string -> Integer or $last -> lastValue)
    public static Integer validateValue(String value) {
        if (value.equals("$last")) {
            return lastValue;
        }
        return Integer.parseInt(value);
    }

    // method to compute results
    public static Integer computeResults(String operator, Integer value1, Integer value2) {
        // switch case for keywords
        // checking operator
        Integer result = 0;
        switch (operator) {
            case ADD:
                result = value1 + value2;
                break;
            case SUBTRACT:
                result = value1 - value2;
                break;
            case DIVIDE:
                result = value1 / value2;
                break;
            case MULTIPLY:
                result = value1 * value2;
                break;
            case EXIT:
                System.out.println("stop while loop");
                stop = true;
                break;
            default:
        } // various operations

        lastValue = result; // update lastValue
        return result;
    } // computeResults

} // class
