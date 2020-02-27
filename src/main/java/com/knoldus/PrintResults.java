package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;

public class PrintResults {

    public void display() {
        PersonalDetails pd = ((name, age, pinCode, countryCode, city) -> (name + " " + age + " " + pinCode + " " + countryCode + " " + city));
        //System.out.println("The Details are : " + pd.displayDetails("Shivani", 24, 201005, 91, "Sahibabad"));
    }

    public void filterOutList(List<String> myList)
    {
        List<String> result = myList.stream().filter(s -> s.startsWith("C") || s.startsWith("c")).sorted().collect(Collectors.toList());
        //System.out.println(result);
    }

    public void listProduct(List<Integer> list1 , List<Integer> list2)
    {
        List<Integer> resultingList =  IntStream.rangeClosed(0,min(list1.size(),list2.size())-1).map(index -> list1.get(index)*list2.get(index)).boxed().collect(Collectors.toList());
        //System.out.println(resultingList);
    }

}
