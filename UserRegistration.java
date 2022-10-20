package com.bridgelabz.UserRegistration;
public class UserRegistration {
    public boolean minimumThreeCharacterNameWithFirstLetterIsCapital(String firstName) {
        String regexFirstName = "^[A-Z]{1}[a-z]{2}[a-z]*$";
        boolean result = firstName.matches(regexFirstName);
        if (result) {
            System.out.println("It Is Valid First Name");
        } else {
            System.out.println("it Is Invalid First Name");
        }
        return result;
    }

    public boolean minimumThreeCharacterNameWithLasNameFirstIsCapital(String lastName) {
        String regexLastName = "^[A-Z]{1}[a-z]{2}[a-z]*$";
        boolean result = lastName.matches(regexLastName);
        if (result) {
            System.out.println("It Is Valid Last Name");
        } else {
            System.out.println("It Is Invalid!! Please Enter Minimum Three Character Or Start Last Name With Capital");
        }
        return result;
    }

    public boolean check_Enter_Email_Validity(String emailId){
        String regexEmailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        boolean result = emailId.matches(regexEmailId);

        if(result){
            System.out.println("Email Id Is Valid");
        }else{
            System.out.println("oops Something Went Wrong!!");
            System.out.println("Please Enter All Required Fields");
            System.out.println("eg:example.samplemail@gmail.com");
        }
        return result;
    }

    public boolean check_Mobile_Number(String mobileNumber) {

        String regexMobileNumber = "[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";

        boolean result = mobileNumber.matches(regexMobileNumber);

        if (result) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Mobile Number is Invalid!!");
            System.out.println("eg:+917948556486");
            System.out.println("Please Refer Above Format!!");
        }
        return result;
    }
    public boolean check_Password(String password) {

        //Rule 1-2 - Minimum 8 Characters With At least Minimum 1 Uppercase
        //String regexPassword = "^[A-Z]{1}[a-zA-Z]{7,}$";
        //Rule3 - atleast 1 number
        //String regexPassword = "^[a-zA-Z0-9]{8,}$";

        //Rule 4 - Minimum 8 Characters With At least Minimum 1 Uppercase, 1 Numeric Value and 1 Special Character
        String regexPassword = "^(?=.*[a-z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{5,}$";


        boolean result = password.matches(regexPassword);

        if (result) {
            System.out.println("Password Is Valid");
        } else {
            System.out.println("Password Is Invalid!!");
            System.out.println("Please Enter Minimum 8 Characters With Atleast 1 Uppercase Letter");
        }
        return result;
    }

}



