package com.hargun.college;

import java.util.Date;

import com.hargun.hardware.Computer;
import com.hargun.other.IDisplay;


public abstract class Person implements IDisplay{
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String email;
    Computer c1 = new Computer();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName()
    {
        return this.firstName+" "+this.lastName;
    }

    @Override
    public void dislay() {

    }
}
