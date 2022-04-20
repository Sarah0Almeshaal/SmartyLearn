package cpit280;

import java.util.Date;

public class Child {

    private String Fname, Lname, password, birthDate, username;

    
    
    public Child(String Fname, String Lname, String password, String birthDate, String username, int phoneNum) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.password = password;
        this.birthDate = birthDate;
        this.username = username;
        this.phoneNum = phoneNum;
    }
    
        Child() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private int phoneNum;

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Child{" + "Fname=" + Fname + ", Lname=" + Lname + ", password=" + password + ", birthDate=" + birthDate + ", username=" + username + ", phoneNum=" + phoneNum + '}';
    }

   
    

}
