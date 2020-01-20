package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank<Visa> bankM = new Bank<>(new Visa());
        bankM.pay();
        Bank<Visa> bankV = new Bank<>(new Visa());
        bankV.pay();

    }
}
