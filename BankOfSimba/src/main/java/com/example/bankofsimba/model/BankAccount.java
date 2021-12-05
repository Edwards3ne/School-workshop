package com.example.bankofsimba.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private Boolean isKing;
    private Boolean Bad;

    public BankAccount(String name, Double balance, String animalType,Boolean isKing,Boolean Bad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing=isKing;
        this.Bad=Bad;
    }
    public double addMoneyBy(Double howMuch){
        return balance=balance+howMuch;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Boolean getKing() {
        return isKing;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }

    public Boolean getBad() {
        return Bad;
    }

    public void setBad(Boolean bad) {
        Bad = bad;
    }
}
