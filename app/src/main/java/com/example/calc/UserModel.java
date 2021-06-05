package com.example.calc;

public class UserModel {
    private int id;
    private String fName;
    private String lName;
    private long birthday;
    private String country;
    private String city;

    public UserModel(int id, String fName, String lName, long birthday, String country, String city) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
    }

    public int Id() {return id;}
    public void setId(int id) {this.id = id;}
    public String firstName() {return fName;}
    public void setFirstName(String fName) {this.fName = fName;}
    public String lastName() {return lName;}
    public void setLastName(String lName) {this.lName = lName;}
    public long getBirthday() {return birthday;}
    public void setBirthday(long birthday) {this.birthday = birthday;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
}
