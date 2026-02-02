package com.github.hosewell.generics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.hosewell.inheritance.Animal;
import com.github.hosewell.interfaces.Student;

public class Main {
    public static void main(String[] args) {
        // oldBeforeGenerics();
        // newWithinGenerics();
        bookOperations();

    }

    private static void bookOperations() {
        Box<Book> bookBox = new Box<>();

        bookBox.add(new Book("Java Se", "Paul"));
        bookBox.add(new Book("Java Se 2", "Richard"));
        bookBox.contains(null);

        Box<Flower> flowers = new Box<>();
        flowers.add(new Flower("Rose"));
        flowers.contains(null);

        Room<Student> a = new Room<>();
        Room<Animal> animalRoom = new Room<>();

        ApiResponse<Student> studentResponse = new ApiResponse<>();

        studentResponse.setData(new Student("Hosewell"));
        studentResponse.setSuccess(true);
        studentResponse.setError(null);

        ApiResponse<List<Student>> studentsResponse = new ApiResponse<>();

        GenericMethods.printArray(new Integer[] { 45, 45 });
        System.out.println();
        GenericMethods.printArray(new Double[] { 45.0, 48.5 });

        Shed<Cow> studentsShed = new Shed<>();
        Shed<Sheep> sheepShed = new Shed<>();
        System.out.println();
        System.out.println(GenericMethods.print(34.0, 40.7));
        System.out.println(GenericMethods.print(34, 40));

    }

    private int add(int a, int b) {
        return a + b;
    }

    private static void newWithinGenerics() {
        List<String> list = new ArrayList<>();
        list.add("Hello"); // 0
        list.add("123"); // 1 // No compile-time check
        list.add(new Date().toInstant().toString()); // 2
        list.add(LocalDateTime.now().toString()); // 2

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        String first = list.get(0); // Works
        String second = list.get(1); // ClassCastException!
        Integer number = Integer.parseInt(list.get(1)); // Would work, but how to know?
    }

    private static void oldBeforeGenerics() {
        List list = new ArrayList();
        list.add("Hello");
        list.add(123); // No compile-time check
        list.add(new Date());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        String first = (String) list.get(0); // Works
        String second = String.valueOf(list.get(1)); // ClassCastException!
        Integer number = (Integer) list.get(1); // Would work, but how to know?
    }

}