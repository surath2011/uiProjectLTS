package org.example;

public interface exampleInterface {
    void display(int age);
    public static void sum(){
        System.out.println("hello");
    }
    default void minus(){
        System.out.println("hello");
    }
}
