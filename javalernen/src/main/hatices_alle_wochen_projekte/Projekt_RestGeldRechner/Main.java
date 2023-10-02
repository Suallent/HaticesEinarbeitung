package main.hatices_alle_wochen_projekte.Projekt_RestGeldRechner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final double[] numbers = new double[] { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02,
                0.01 };

        RemainingMoneyCalculator finalAmount = new RemainingMoneyCalculator();
        finalAmount.remainingMoneyCalculator();
        System.out.printf("Das endbetrag beträgt $%.2f", finalAmount.getPaid() - finalAmount.getCosts());

        BillCalculator returnBanknotes = new BillCalculator();
        returnBanknotes.billCalculator(finalAmount.getPaid() - finalAmount.getCosts());

        System.out.println(" Am besten holst du dir diese Gelscheine");

        for (int i = 0; i < numbers.length; i++) {
            returnBanknotes.zähleScheine(numbers[i]);
        }

    }

}



