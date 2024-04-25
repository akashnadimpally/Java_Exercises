package com.skynet.skynet;

import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import javax.persistence.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String Email;

    @Column(nullable = false, unique = false, length = 64)
    private String Password;

    @Column(nullable = false, unique = false, length = 45)
    private String First_Name;

    @Column(nullable = false, unique = false, length = 45)
    private String Last_Name;

    @Column(nullable = false, unique = true, length = 45)
    private Long Contact_Number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {

        if (!isEmailValid(Email)) {
            throw new IllegalArgumentException("Invalid Email format");
        }
        this.Email = Email;
    }

    private boolean isEmailValid(String Email) {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9._-]*@[A-Za-z0-9]+\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        if (!isValidPassword(Password)) {
            throw new IllegalArgumentException("Invalid password format");
        }
        this.Password = new BCryptPasswordEncoder().encode(Password);
    }

    private boolean isSpecialCharacter(char c) {
        String specialChars = "@#$%&<>?/\\|!~+-=.,()[]{}:\"";
        return specialChars.indexOf(c) != -1;
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpper = false, hasLower = false, hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (isSpecialCharacter(c)) hasSpecial = true;

            if (hasUpper && hasLower && hasSpecial) return true;
        }
        return false;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public Long getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(Long contact_Number) {
        Contact_Number = contact_Number;
    }
}
