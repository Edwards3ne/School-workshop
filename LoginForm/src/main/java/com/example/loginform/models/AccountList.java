package com.example.loginform.models;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

    private List<Account> accounts=new ArrayList<>();

    public void addAcc(Account account){accounts.add(account);}

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
