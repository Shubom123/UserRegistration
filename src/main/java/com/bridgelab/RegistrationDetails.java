package com.bridgelab;
import java.util.regex.*;
import java.util.Scanner;

public class RegistrationDetails {
    public static boolean validateFirstName(String firstName){
        System.out.println("Enter First Name");
        /*Scanner sc = new Scanner(System.in);
        firstName = sc.nextLine();*/
        String regex="^[A-Z][a-z]{3,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);
        boolean b = m.matches();
        System.out.println(b);
        return b;

        /*if(b==true)
            System.out.println("First name is valid");

        else
            System.out.println("First name is invalid");
*/
    }
    public static boolean validateLastName(String lastName){
       System.out.println("Enter Last Name");
       /* Scanner sc = new Scanner(System.in);
        lastName = sc.nextLine();*/
        String regex="^[A-Z][a-z]{3,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        boolean b = m.matches();
        System.out.println(b);
        return b;

       /* if(b==true)
            System.out.println("Last name is valid");

        else
            System.out.println("Last name is invalid");
*/
    }
    public static boolean validateEmail(String email){
        System.out.println("Enter Email id");
        /*Scanner sc = new Scanner(System.in);
        email = sc.nextLine();*/
        String regex="^[a-z0-9]{2,}(['.''\\-''+']?)([a-z0-9]*)+@[a-z]{2,}['.'][a-z]{2,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        System.out.println(b);
        return b;

        /*if(b==true)
            System.out.println("Email id is valid");

        else
            System.out.println("Email Id is invalid");
*/
    }
    public static boolean validateMobileNumber(String mobile){
        System.out.println("Enter Mobile number");
        /*Scanner sc = new Scanner(System.in);
        mobile = sc.nextLine();*/
        String regex="^[1-9]{2}\\s{0,1}[0-9]{10}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobile);
        boolean b = m.matches();
        System.out.println(b);
        return b;

        /*if(b==true)
            System.out.println("Mobile number is valid");

        else
            System.out.println("Mobile Number is invalid");
*/
    }
    public static boolean validatePassword(String password){
       System.out.println("Enter Password");
        /*Scanner sc = new Scanner(System.in);
        password = sc.nextLine();*/
        String regex="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        System.out.println(b);
        return b;

      /*  if(b==true)
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");*/
    }
}
