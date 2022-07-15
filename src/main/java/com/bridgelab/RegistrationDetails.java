package com.bridgelab;
import java.util.regex.*;
import java.util.Scanner;

@FunctionalInterface
interface Validate{
    boolean validate(String input) throws InvalidContent;
}
public class RegistrationDetails {
    // Created a method to validate first name using lambda expression
    Validate validFirstName = firstName ->{
        if(firstName==null){
            throw new InvalidContent(InvalidContent.ExceptionType.NULL,"Input can't be null");
        } else if (firstName.length()==0) {
            throw new InvalidContent(InvalidContent.ExceptionType.EMPTY,"Input can't be empty");
        }
        {
            String regex="^[A-Z][a-z]{3,}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(firstName);
            boolean b = m.matches();
            return b;
        }
    };
    Validate validLastName = lastName ->{
        if(lastName==null){
            throw new InvalidContent(InvalidContent.ExceptionType.NULL,"Input can't be null");
        } else if (lastName.length()==0) {
            throw new InvalidContent(InvalidContent.ExceptionType.EMPTY,"Input can't be empty");
        }
        {
            String regex="^[A-Z][a-z]{3,}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(lastName);
            boolean b = m.matches();
            return b;
        }
    };
    Validate validEmail = email ->{
        if(email==null){
            throw new InvalidContent(InvalidContent.ExceptionType.NULL,"Input can't be null");
        } else if (email.length()==0) {
            throw new InvalidContent(InvalidContent.ExceptionType.EMPTY,"Input can't be empty");
        }
        {
            String regex="^[a-z0-9]{2,}(['.''\\-''+']?)([a-z0-9]*)+@[a-z]{2,}['.'][a-z]{2,}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(email);
            boolean b = m.matches();
            return b;
        }
    };
    Validate validPhoneNumber = phoneNumber ->{
        if(phoneNumber==null){
            throw new InvalidContent(InvalidContent.ExceptionType.NULL,"Input can't be null");
        } else if (phoneNumber.length()==0) {
            throw new InvalidContent(InvalidContent.ExceptionType.EMPTY,"Input can't be empty");
        }
        {
            String regex="^[1-9]{2}\\s{0,1}[0-9]{10}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phoneNumber);
            boolean b = m.matches();
            return b;
        }
    };
    Validate validPassword = password ->{
        if(password==null){
            throw new InvalidContent(InvalidContent.ExceptionType.NULL,"Input can't be null");
        } else if (password.length()==0) {
            throw new InvalidContent(InvalidContent.ExceptionType.EMPTY,"Input can't be empty");
        }
        {
            String regex="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            boolean b = m.matches();
            return b;
        }
    };
}
