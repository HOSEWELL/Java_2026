package com.github.hosewell.comparablecomparator;

import java.util.Comparator;

import com.github.hosewell.datastructures.lists.Account;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getAccountName().compareTo(o2.getAccountName());
    }

}
