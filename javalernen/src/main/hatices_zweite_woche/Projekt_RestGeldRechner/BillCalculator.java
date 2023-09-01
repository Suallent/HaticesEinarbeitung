package main.hatices_zweite_woche.Projekt_RestGeldRechner;

import java.util.ArrayList;

public class BillCalculator {

    ArrayList<Double> moneyBill = new ArrayList<Double>();

    public void billCalculator(double remainingMoney) {

        while (remainingMoney != 0) {

            if (remainingMoney >= 100) {
                remainingMoney -= 100;
                moneyBill.add(100.0);
            }
            if (remainingMoney >= 50) {
                remainingMoney -= 50;
                moneyBill.add(50.0);
            }
            if (remainingMoney >= 20) {
                remainingMoney -= 20;
                moneyBill.add(20.0);
            }
            if (remainingMoney >= 10) {
                remainingMoney -= 10;
                moneyBill.add(10.0);
            }
            if (remainingMoney >= 5) {
                remainingMoney -= 5;
                moneyBill.add(5.0);
            }
            if (remainingMoney >= 2) {
                remainingMoney -= 2;
                moneyBill.add(2.0);
            }
            if (remainingMoney >= 1) {
                remainingMoney -= 5;
                moneyBill.add(1.0);
            }
            if (remainingMoney >= 0.50) {
                remainingMoney -= 0.50;
                moneyBill.add(0.50);
            }
            if (remainingMoney >= 0.20) {
                remainingMoney -= 0.20;
                moneyBill.add(0.20);
            }
            if (remainingMoney >= 0.10) {
                remainingMoney -= 0.10;
                moneyBill.add(0.10);
            }
            if (remainingMoney >= 0.05) {
                remainingMoney -= 0.05;
                moneyBill.add(0.05);
            }
            if (remainingMoney >= 0.02) {
                remainingMoney -= 0.02;
                moneyBill.add(0.02);
            }
            if (remainingMoney >= 0.01) {
                remainingMoney -= 0.01;
                moneyBill.add(0.01);
            }

        }

    }

    public void zähleScheine(double bills) {

        int referenceAmount = 0;

        for (int i = 0; i < moneyBill.size(); i++) {

            if (moneyBill.get(i) == bills) {
                referenceAmount++;

            }

        }
        String allBills = String.valueOf(bills);

        System.out.println(referenceAmount + " " + allBills + " bills");

    }

}
