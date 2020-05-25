package ua.mishko.training.automationScenaries;

public class User {

     private String email;
     private String passwd;
     private String guestTitle;
     private String authorizedTitle;
     private String authorizedUsername;
     private String phone;


    public User() {
        this.email = "andreimishko084934@gmail.com";
        this.passwd = "qwerty";
        this.guestTitle = "Login - My Store";
        this.authorizedTitle = "My account - My Store";
        this.authorizedUsername = "Andrey Mishko";
        this.phone = "0932017145";
    }

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getGuestTitle() {
        return guestTitle;
    }

    public String getAuthorizedTitle() {
        return authorizedTitle;
    }

    public String getAuthorizedUsername() {
        return authorizedUsername;
    }

    public String getPhone() {
        return phone;
    }
}
