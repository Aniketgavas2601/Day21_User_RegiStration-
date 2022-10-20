package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstNameHappy() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.minimumThreeCharacterNameWithFirstLetterIsCapital("Aniket");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testFirstNameSad() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.minimumThreeCharacterNameWithFirstLetterIsCapital("aniket");
        Assert.assertEquals(false, isValid);
    }

    //Test Last Name Is Valid or Invalid

    @Test
    public void testLastNameHappy() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.minimumThreeCharacterNameWithLasNameFirstIsCapital("Gavas");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testLastNameSad() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.minimumThreeCharacterNameWithLasNameFirstIsCapital("gavas");
        Assert.assertEquals(false, isValid);
    }

    //Test Email Is Valid or Invalid

    @Test
    public void testEmailHappy() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Enter_Email_Validity("Ani.s@bridge.co.in");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testEmailSad() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Enter_Email_Validity("bridge.co.in");
        Assert.assertEquals(false, isValid);
    }

    //Test Mobile Number Is Valid or Invalid

    @Test
    public void testMobileNumberHappy() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Mobile_Number("+917948556486");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testMobileNumberSad() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Mobile_Number("91 999498");
        Assert.assertEquals(false, isValid);
    }

    //Test Password Is Valid or Invalid

    @Test
    public void testPasswordHappy() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Password("Aniket@18");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testPasswordSad() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.check_Password("aniket18");
        Assert.assertEquals(false, isValid);
    }
}
