package com.company;

import java.util.Scanner;

public class Visa implements ICard {

    private double balanse = 1000;
    private long idCard;

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public double getBalanse() {
        return balanse;
    }

    public long getIdCard() {
        return idCard;
    }

    @Override
    public void getMoney(double amount) {

        Scanner in = new Scanner(System.in);

        if(balanse >= amount){
            System.out.println("Podigli ste sa racuna " + amount + " stanje racuna je  " + (balanse-amount));
        }else {
            System.out.println("Nemate dovoljno sredtsva na racunu");

        }

    }

    @Override
    public boolean validate() {

        if(balanse > 0){
            return true;
        }
        return false;
    }
}
