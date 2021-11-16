package com.user.user_service.entity;

import org.springframework.context.annotation.ComponentScan;


public class Contact {

    private Long cID;
    private String email;
    private String contactName;
    private Long userId;
//constructor (commnand+N)
    public Contact(Long cID, String email, String contactName, Long userId) {
        this.cID = cID;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }
//default constructor for contact class
    public Contact() {
    }
//getter and setters
    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
