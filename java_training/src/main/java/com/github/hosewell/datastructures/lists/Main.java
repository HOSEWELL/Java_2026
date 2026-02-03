package com.github.hosewell.datastructures.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        accountOperations();

    }

        private static void accountOperations() {
        List<Account> accounts = new ArrayList<>();

        accounts.add((new Account("Hosewell", "12345", 4500.00)));
        System.out.println(accounts);

          
     }
}
