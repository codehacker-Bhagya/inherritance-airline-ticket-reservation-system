package com.bhagya.inherittance.practice.controller;

import com.bhagya.inherittance.practice.service.PassengerService;

public class PassengerController {

    private final PassengerService passengerService = new PassengerService();

    public void createPassenger(){
        PassengerService.registerPassenger();
        PassengerService.displayPassenger();
    }

}
