package com.bridgelabz.UserRegistration;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.minimumThreeCharacterNameWithFirstLetterIsCapital("Aniket");
        userRegistration.minimumThreeCharacterNameWithLasNameFirstIsCapital("Gavas");
        userRegistration.check_Enter_Email_Validity("samplemail@gmail.com");
        userRegistration.check_Mobile_Number("+917948556486");
        userRegistration.check_Password("Aniket1gavas@");
    }


}
