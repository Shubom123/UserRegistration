package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationDetailsTest {
    @Test
    public void testFirstNameTrue(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result = registrationDetails.validateFirstName("Shubom");
        Assertions.assertTrue(result);
    }
    @Test
    public void testFirstNameFalse(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result = registrationDetails.validateFirstName("shubom");
        Assertions.assertFalse(result);
    }
    @Test
    public void testLastNameTrue(){
        RegistrationDetails registrationDetails1=new RegistrationDetails();
        boolean result1 = registrationDetails1.validateLastName("Nath");
        Assertions.assertTrue(result1);
    }
    @Test
    public void testLastNameFalse(){
        RegistrationDetails registrationDetails1=new RegistrationDetails();
        boolean result1 = registrationDetails1.validateLastName("nath");
        Assertions.assertFalse(result1);
    }
    @Test
    public void testEmailTrue(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result2 = registrationDetails.validateEmail("shubom.nath123@gmail.com");
        Assertions.assertTrue(result2);
    }@Test
    public void testEmailFalse(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result2 = registrationDetails.validateEmail("shubomgmail.com");
        Assertions.assertFalse(result2);
    }
    @Test
    public void testPhoneNumberTrue(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result3 = registrationDetails.validateMobileNumber("918288894252");
        Assertions.assertTrue(result3);
    }
    @Test
    public void testPhoneNumberFalse(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result3 = registrationDetails.validateMobileNumber("8288894252");
        Assertions.assertFalse(result3);
    }
    @Test
    public void testPasswordTrue(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result4 = registrationDetails.validatePassword("Shubom@123");
        Assertions.assertTrue(result4);
    }
    @Test
    public void testPasswordFalse(){
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result4 = registrationDetails.validatePassword("Shubom");
        Assertions.assertFalse(result4);
    }
}