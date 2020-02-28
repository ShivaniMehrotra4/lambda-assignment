package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User is a user defined class having attributes id,name,address,age.
 */
public class User {
    private Integer id;
    private String name;
    private String address;
    private String age;

    public User() {}

    public User(Integer id, String name, String address, String age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    /**
     * filterUserAgeCity function takes in a list of users as input,
     * and list out all the users with age above 18 and address Delhi.
     * @param list - List of User objects.
     * @return List of names (Strings).
     */
    public List<String> filterUserAgeCity(List<User> list) {
        return list.stream()
                .filter(ele -> Integer.parseInt(ele.getAge()) > 18 && ele.getAddress().equals("Delhi"))
                .map(User::getName)
                .collect(Collectors.toList());
    }

    /**
     * filterUserIdAge function takes in a list of users as input,
     * and list out all the users with id greater than 10 and age less than 20.
     * @param list - List of User objects.
     * @return List of names (Strings).
     */
    public List<String> filterUserIdAge(List<User> list) {
        return list.stream()
                .filter(ele -> ele.getId() > 10 && Integer.parseInt(ele.getAge()) < 20)
                .map(User::getName)
                .collect(Collectors.toList());
    }

    /**
     * filterUserEvenAge function takes in a list of users as input,
     * and list out all the users with age as even number.
     * @param list - List of User objects.
     * @return List of names (Strings).
     */
    public List<String> filterUserEvenAge(List<User> list) {
        return list.stream()
                .filter(ele -> Integer.parseInt(ele.getAge()) % 2 == 0)
                .map(User::getName)
                .collect(Collectors.toList());
    }

    /**
     * filterUserAgeEqualCity function takes in a list of users as input,
     * and list out all the users with age equals to 18 and address Delhi.
     * @param list - List of User objects.
     * @return List of names (Strings).
     */
    public List<String> filterUserAgeEqualCity(List<User> list) {
        return list.stream()
                .filter(ele -> ele.getAge().equals("18") && ele.getAddress().equals("Delhi"))
                .map(User::getName)
                .collect(Collectors.toList());
    }

}
