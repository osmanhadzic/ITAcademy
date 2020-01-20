package com.company;

import java.util.Scanner;

public class Bank <CardType extends ICard> {

    CardType cardType;

    public Bank(CardType cardType) {
        this.cardType = cardType;
    }

    public boolean pay(){
        Scanner in = new Scanner(System.in);
        if (cardType.validate()){
            double amount;
            System.out.println("Unesite iznos za isplatu: ");
            amount = in.nextDouble();
            cardType.getMoney(amount);
            return true;
        }else {
            return false;
        }
    }
}
