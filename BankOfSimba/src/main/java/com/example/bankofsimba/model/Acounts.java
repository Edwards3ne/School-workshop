package com.example.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Acounts {
     private List<BankAccount> bankAccounts=new ArrayList<>();

     public void addAcc(BankAccount bankAccount){
         bankAccounts.add(bankAccount);
     }


    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }
    public List<Boolean> getBad () {
        return bankAccounts.stream()
                .map(BankAccount::getBad)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<BankAccount> getByBad(Boolean bad) {

             return bankAccounts.stream()
                     .filter(bankAccount -> bankAccount.getBad().equals(bad))
                     .collect(Collectors.toList());


    }


    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
