package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exampleLambda {
    public static void main(String[] args) {
        exampleInterface ex = (age)-> System.out.println("Hi my age is : "+age);
        ex.display(200);
        List<String> mylist = new ArrayList<>();
        mylist = Arrays.asList("iPhone","Charger","Shoes","food");
        List<String> newList = mylist.stream().filter(x->!x.equals("Charger")).collect(Collectors.toList());
        newList.forEach(System.out::println);
        List<customer> customerList = Arrays.asList(new customer("nike",100), new customer("puma",200));
        customer newCustomerList = customerList.stream().filter(x->"puma".equals(x.getName())).
                                        findAny().orElse(null);
        System.out.println(newCustomerList.getPrice());
    }
}
