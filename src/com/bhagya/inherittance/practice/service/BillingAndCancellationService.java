package com.bhagya.inherittance.practice.service;

import com.bhagya.inherittance.practice.model.BillingAndCancellation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BillingAndCancellationService {

    private Map<Integer, BillingAndCancellation> billingAndCancellations = new HashMap<>();
    int billingIndex = 0;
    Scanner scanner = new Scanner(System.in);

    // private BillingAndCancellation[] billings = new BillingAndCancellation[3];

    public void billingData() {
        System.out.println(billingAndCancellations);

    }

    public BillingAndCancellation BillingService() {

        int option = 0;

        BillingAndCancellation billingAndCancellation = new BillingAndCancellation();

       option = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls Select Your Payment Method");
        String method = scanner.nextLine();
        System.out.println("Enter Your UPI ID");
        int upiid = Integer.parseInt(scanner.nextLine());
        System.out.println("I you Want cancle Your Reservation pls read instructions and press cancle button");


        return billingAndCancellation;

    }

    public void displayBilling() {
        Set<Map.Entry<Integer, BillingAndCancellation>> entrySet = billingAndCancellations.entrySet();
        for (Map.Entry<Integer, BillingAndCancellation> billingAndCancellationEntry : entrySet) {
            System.out.println("Key :" + billingAndCancellationEntry.getKey());
        }


    }
}