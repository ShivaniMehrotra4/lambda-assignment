package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Integer id;
    private String name;
    private String address;
    private String age;

    public User()
    {

    }
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

//    public void listOperations(List<User> list)
//    {
//        //1
//        List<String> result1 = list.stream().filter(ele -> Integer.parseInt(ele.getAge()) >18 && ele.getAddress().equals("Delhi")).map(User::getName).collect(Collectors.toList());
//        System.out.println("Users with age above 18 and address Delhi : " + result1);
//
//        //2
//        List<String> result2 = list.stream().filter(ele -> ele.getId() >10 && Integer.parseInt(ele.getAge())<20).map(User::getName).collect(Collectors.toList());
//        System.out.println("Users with the id greater than 10 and age less than 20 : " + result2);
//
//        //3
//        List<String> result3 = list.stream().filter(ele -> Integer.parseInt(ele.getAge())%2==0).map(User::getName).collect(Collectors.toList());
//        System.out.println("Users with age as even number : " + result3);
//
//        //4
//        List<String> result4 = list.stream().filter(ele -> ele.getAge().equals("18") && ele.getAddress().equals("Delhi")).map(User::getName).collect(Collectors.toList());
//        System.out.println("Users with age equals to 18 and address Delhi : " + result4);
//    }

    public List<String> questionOne(List<User> list)
    {
        return list.stream().filter(ele -> Integer.parseInt(ele.getAge()) >18 && ele.getAddress().equals("Delhi")).map(User::getName).collect(Collectors.toList());
    }
    public List<String> questionTwo(List<User> list)
    {
        return list.stream().filter(ele -> ele.getId() >10 && Integer.parseInt(ele.getAge())<20).map(User::getName).collect(Collectors.toList());
    }
    public List<String> questionThree(List<User> list)
    {
        return list.stream().filter(ele -> Integer.parseInt(ele.getAge())%2==0).map(User::getName).collect(Collectors.toList());
    }
    public List<String> questionFour(List<User> list)
    {
        return list.stream().filter(ele -> ele.getAge().equals("18") && ele.getAddress().equals("Delhi")).map(User::getName).collect(Collectors.toList());
    }
}
