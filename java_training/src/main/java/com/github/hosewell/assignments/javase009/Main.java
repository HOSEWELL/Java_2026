package com.github.hosewell.assignments.javase009;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("S101", "Hosewell", "hosewell@gmail.com", "Software Engineering", 3.9);
        Professor p = new Professor("P202", "Dr. James", "james@uni.co.ke", "Physics", 85000);
        Staff st = new Staff("ST303", "Alice", "alice@uni.co.ke", "Registrar", 40);

        System.out.println("University System Records");
        System.out.println(s.toString());
        System.out.println(p.toString());
        System.out.println(st.toString());
    }
}
