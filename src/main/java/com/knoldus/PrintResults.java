package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;

/**
 * This class is used for printing results of various queries specified by the user.
 */
public class PrintResults {

    public void display() {
        PersonalDetails pd = ((name, age, pinCode, countryCode, city) ->
                (name + " " + age + " " + pinCode + " " + countryCode + " " + city));
    }

    public void filterOutList(List<String> myList) {
        List<String> result = myList.stream()
                .filter(s -> s.startsWith("C") || s.startsWith("c"))
                .sorted()
                .collect(Collectors.toList());
    }

    public void listProduct(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultingList = IntStream.rangeClosed(0, min(list1.size(), list2.size()) - 1)
                .map(index -> list1.get(index) * list2.get(index))
                .boxed()
                .collect(Collectors.toList());
    }

}
