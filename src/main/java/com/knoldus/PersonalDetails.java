package com.knoldus;

@FunctionalInterface
public interface PersonalDetails {
    String displayDetails(String name,int age,int pinCode,int countryCode,String city);
}
