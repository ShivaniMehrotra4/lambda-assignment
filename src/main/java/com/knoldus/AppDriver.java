package com.knoldus;

import java.util.Arrays;
import java.util.List;

public class AppDriver {

    public static void main(String[] args) {

        PrintResults printResult = new PrintResults();

        //QUESTION-1
        printResult.display();

        //QUESTION-2
        List<String> myList = Arrays.asList("Ahemdabad", "cat", "himachal", "Coimbatore", "Delhi",
                "Calcutta", "Sahibabad", "Cupid");
        printResult.filterOutList(myList);

        //QUESTION-3
        List<Integer> list1 = Arrays.asList(1, 5, 2, 8, 3, 8);
        List<Integer> list2 = Arrays.asList(4, 7, 2, 9, 3);
        printResult.listProduct(list1, list2);

        //QUESTION 4
        User sampleUser1 = new User(1355, "Shivani", "Sahibabad", "24");
        User sampleUser2 = new User(1356, "Sparsh", "Noida", "19");
        User sampleUser3 = new User(1357, "Mansi", "Delhi", "11");
        User sampleUser4 = new User(1353, "Muskan", "Faridabad", "13");
        User sampleUser5 = new User(1351, "Upanshu", "Delhi", "18");
        User sampleUser6 = new User(1359, "Kavya", "Delhi", "25");
        List<User> listOfUsers = Arrays.asList(sampleUser1, sampleUser2, sampleUser3,
                sampleUser4, sampleUser5, sampleUser6);
        User test = new User();
        //1
        System.out.println(test.filterUserAgeCity(listOfUsers));
        //2
        System.out.println(test.filterUserIdAge(listOfUsers));
        //3
        System.out.println(test.filterUserEvenAge(listOfUsers));
        //4
        System.out.println(test.filterUserAgeEqualCity(listOfUsers));
    }
}