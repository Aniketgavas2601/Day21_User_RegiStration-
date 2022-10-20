package com.bridgelabz.UserRegistration;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.minimumThreeCharacterNameWithFirstLetterIsCapital("Aniket");
        userRegistration.minimumThreeCharacterNameWithLasNameFirstIsCapital("Gavas");
        userRegistration.check_Enter_Email_Validity("samplemail@gmail.com");
        userRegistration.check_Mobile_Number("91 9920365423");
        userRegistration.check_Password("Aniketgavass");
    }


}
