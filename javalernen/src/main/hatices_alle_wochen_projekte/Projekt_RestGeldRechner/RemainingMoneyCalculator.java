package main.hatices_alle_wochen_projekte.Projekt_RestGeldRechner;

import java.util.Scanner;

public class RemainingMoneyCalculator {

    private double costs;
    private double paid;

    public void remainingMoneyCalculator() {

        System.out.println("Willkommen zum Restgeldrechner");

        System.out.println("Geben Sie die Kosten an");
        Scanner userCosts = new Scanner(System.in);
        costs = userCosts.nextDouble();

        System.out.println("Geben Sie an wie viel Sie payment haben");
        Scanner userPayment = new Scanner(System.in);
        paid = userPayment.nextDouble();

        // this.costs = costs;
        // this.paid = paid;

    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getCosts() {
        return costs;
    }

    public double getPaid() {
        return paid;
    }

}
