package com.bridgelabz.UserRegistration;



public class UserRegistration {
    public void minimumThreeCharacterNameWithFirstLetterIsCapital(String firstName) {
        String regexFirstName = "^[A-Z]{1}[a-z]{2}[a-z]*$";
        boolean result = firstName.matches(regexFirstName);
        if (result) {
            System.out.println("It Is Valid First Name");
        } else {
            System.out.println("it Is Invalid First Name");
        }
    }

}



