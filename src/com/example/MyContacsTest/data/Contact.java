package com.example.MyContacsTest.data;

/**
 * Created by CRISTIANDANIEL on 6/24/2015.
 */
public class Contact {
    private String name;
    private String email;
    private String address;
    private long phone;

    public Contact(String name, String email, long phone, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }


}


