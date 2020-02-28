package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User is a user defined class having common attributes.
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

    public List<String> questionOne(List<User> list) {
        return list.stream()
                .filter(ele -> Integer.parseInt(ele.getAge()) > 18 && ele.getAddress().equals("Delhi"))
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<String> questionTwo(List<User> list) {
        return list.stream()
                .filter(ele -> ele.getId() > 10 && Integer.parseInt(ele.getAge()) < 20)
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<String> questionThree(List<User> list) {
        return list.stream()
                .filter(ele -> Integer.parseInt(ele.getAge()) % 2 == 0)
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<String> questionFour(List<User> list) {
        return list.stream()
                .filter(ele -> ele.getAge().equals("18") && ele.getAddress().equals("Delhi"))
                .map(User::getName)
                .collect(Collectors.toList());
    }

}
