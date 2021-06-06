package com.example.calc;

import java.util.Date;

public class UserModel {
    private int id;
    private String fName;
    private String lName;
    private Date birthday;
    private String country;
    private String city;
/*
  в связи с разработкой под API 23, для вычисления возраста пришлось использовать
  устаревшие методы класса Date.
  A хотел использовать класс LocalDate (API 26).
  И хрнить даты оказалось удобнее в Date чем в long
*/
    public UserModel(int id,String fName,String lName,Date birthday,String country,String city) {
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
    public String Age() {
        Date currDate = new Date();
        Date birthdayInCurrentYear=new Date(
                currDate.getYear()+1900,
                birthday.getMonth(),
                birthday.getDate());
        int correction =birthdayInCurrentYear.before(currDate)?1:0;
        return "Возраст (полных лет): "+(currDate.getYear()+1900-birthday.getYear()-correction);
    }
    public void setBirthday(int yyyy, int mm, int dd) {this.birthday = new Date(yyyy,mm,dd);}
    public String Country() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String City() {return city;}
    public void setCity(String city) {this.city = city;}
}
