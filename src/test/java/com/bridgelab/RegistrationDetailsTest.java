package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationDetailsTest {
    @Test
    public void testFirstNameTrue() throws InvalidContent{
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result = registrationDetails.validFirstName.validate("Shubom");
        Assertions.assertTrue(result);
    }

    @Test
    public void testLastNameTrue() throws InvalidContent{
        RegistrationDetails registrationDetails1=new RegistrationDetails();
        boolean result1 = registrationDetails1.validLastName.validate("Nath");
        Assertions.assertTrue(result1);
    }

    @Test
    public void testEmailTrue() throws InvalidContent{
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result2 = registrationDetails.validEmail.validate("shubom.nath123@gmail.com");
        Assertions.assertTrue(result2);
    }

    @Test
    public void testPhoneNumberTrue() throws InvalidContent{
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result3 = registrationDetails.validPhoneNumber.validate("918288894252");
        Assertions.assertTrue(result3);
    }

    @Test
    public void testPasswordTrue() throws InvalidContent{
        RegistrationDetails registrationDetails=new RegistrationDetails();
        boolean result4 = registrationDetails.validPassword.validate("Shubom@123");
        Assertions.assertTrue(result4);
    }
}
