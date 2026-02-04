package com.github.hosewell.datastructures.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // duplicate();
        // duplicateRemoval();
        // iterateWithSet();
        // listIteratorExample();
        maps();
        
    }

    static void duplicate(){
        // List allows duplicates and maintains insertion order
        List<String> name = new ArrayList<>(6);
        name.add("Alice");
        name.add("Bob");
        name.add("Alice"); 
        name.add("Charlie");
        name.add (null);

        System.out.println("List after adding elements: " + name);
        System.out.println("Size of the list: " + name.size());

    }

    // set does not allow duplicates
    static void duplicateRemoval(){
        Set<String> name = new HashSet<>(6);
        name.add("Alice");
        name.add("Bob");
        name.add("Alice"); 
        name.add("Charlie");

        // remove an element from the set
        name.remove("Bob");

        // check if an element exists in the set
        boolean exists = name.contains("Alice");
        System.out.println("Does Alice exist in the set? " + exists);

        System.out.println("Set after adding elements: " + name);
        System.out.println("Size of the set: " + name.size());

    }

    // 
    static void iterateWithSet() {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // 1. Get the iterator from the set
        java.util.Iterator<String> it = names.iterator();

        // 2. Loop while there is another item
        System.out.println("Iterating through Set:");
        while (it.hasNext()) {
            // 3. Get the next item
            String name = it.next();
            System.out.println("Found: " + name);

            // 4. Safe removal: Let's remove "Bob" if we find him
            if (name.equals("Bob")) {
                it.remove(); 
            }
        }
        System.out.println("Set after safe removal: " + names);
    }


    static void listIteratorExample() {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        java.util.ListIterator<String> listIt = list.listIterator();

        System.out.println("Moving Forwards...");
        while(listIt.hasNext()) System.out.println(listIt.next());

        System.out.println("Moving Backwards...");
        while(listIt.hasPrevious()) System.out.println(listIt.previous());
    }


       static void maps() {
        Map<String, Integer> studentGrades = new HashMap<>();
        // Adding key-value pairs
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Alice", 90); // Overwrites previous value

        System.out.println("Student Grades: " + studentGrades);
        System.out.println("Size: " + studentGrades.size());
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));

        // Consumer<? super Integer> consumer = a -> System.out.println(a);

        // studentGrades.values().forEach(a -> System.out.println(a));

        for (var key : studentGrades.keySet()) {
            System.out.println(key);

        }
        for (var value : studentGrades.values()) {
            System.out.println(value);

        }

        for (var entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }

    }


}
