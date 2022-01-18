package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    private String userString;
    private int userInt;
    private double userDouble;

//  CONSTRUCTOR(S)

    public Input() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
//        this.userInt = scanner.nextInt();
    }

    //  METHOD(S)
    public String getString() {
        this.userString = scanner.nextLine();
        return this.userString;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        this.userString = scanner.nextLine();
        return this.userString;
    }

    public boolean yesNo() {
        this.userString = scanner.nextLine();
        if (userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        this.userString = scanner.nextLine();
        if (userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        return userInt;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        this.userInt = scanner.nextInt();
        return this.userInt;
    }

    public int getInt(int min, int max) {
        String s = getString("Choose a number.");
        try{
            int userNum = Integer.valueOf(s);
            if (userNum < min || userNum > max) {
                System.out.printf("Number should be between %d-%d: ", min, max);
                return getInt(min, max);
            }
        }catch(Exception e){
//            e = new Exception("Only numbers please. We can't parse silliness");
            System.err.println("Numbers only please.");
            return getInt(min, max);
        }
        return Integer.valueOf(s);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        this.userInt = scanner.nextInt();
        if (userInt < min || userInt > max) {
            System.out.printf("Number should be between %d-%d: ", min, max);
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

//    public int getBinary(){
//        String s = getString("Enter a binary number: ");
//        int userBinary = Integer.valueOf(s, 2);
//        return userBinary;
//    }
//
//    public int getHex(){
//        String s = getString("Enter a hex number: ");
//        return Integer.valueOf(s, 16);
//    }

    public double getDouble() {
        return userDouble;
    }

    public double getDouble(int min, int max) {
        String d = getString("Choose a decimal: ");
        try{
            Double.valueOf(d);
            if (Double.valueOf(d) <= min || Double.valueOf(d) >= max) {
                System.out.printf("Enter a decimal between %d - %d: ", min, max);
                return getDouble(min, max);
            }
        }catch (Exception e){
            System.err.println("Decimal only please.");
            return getDouble(min, max);
        }
        return Double.valueOf(d);
    }

    public double getDouble(int min, int max, String prompt) {
        System.out.println(prompt);
        this.userDouble = scanner.nextDouble();
        if (userDouble <= min || userDouble >= max) {
            System.out.printf("Enter a decimal between %d - %d: ", min, max);
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

    public static class InputTest {
        public static void main(String[] args) throws Exception {

//            Input user1 = new Input();
        }
    }
}
