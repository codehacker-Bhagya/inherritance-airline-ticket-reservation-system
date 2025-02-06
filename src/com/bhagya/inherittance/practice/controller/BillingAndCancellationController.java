package com.bhagya.inherittance.practice.controller;

import com.bhagya.inherittance.practice.service.BillingAndCancellationService;

public class BillingAndCancellationController {

    private final BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();


    public void TotalBillingData(){

        billingAndCancellationService.billingData();
        billingAndCancellationService.BillingService();
        billingAndCancellationService.displayBilling();

    }
}
