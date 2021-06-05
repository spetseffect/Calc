package com.example.calc;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
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
*/
//    public UserModel(int id,String fName,String lName,long birthday,String country,String city) {
//        this.id = id;
//        this.fName = fName;
//        this.lName = lName;
//        --this.birthday = birthday;
//        this.country = country;
//        this.city = city;
//    }

    public int Id() {return id;}
    public void setId(int id) {this.id = id;}
    public String firstName() {return fName;}
    public void setFirstName(String fName) {this.fName = fName;}
    public String lastName() {return lName;}
    public void setLastName(String lName) {this.lName = lName;}
    public String Age() {
        long ageInMillis = new Date().getTime() - birthday.getTime();
        Date age = new Date(ageInMillis);
        return age.getYear()+" years old";
//        long y = Year..until(birthday,LocalDate.now());
//        return birthday;
    }
    public void setBirthday(int yyyy, int mm, int dd) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(yyyy,mm,dd,0,0,0);
        this.birthday = new Date(yyyy,mm,dd);
    }
    public String Country() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String City() {return city;}
    public void setCity(String city) {this.city = city;}
}
