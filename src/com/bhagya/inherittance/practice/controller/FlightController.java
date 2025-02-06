package com.bhagya.inherittance.practice.controller;

import com.bhagya.inherittance.practice.service.FlightService;

public class FlightController {

    private final FlightService flightService = new FlightService();

    public void printFlight(){
        flightService.FlightInformation();
        flightService.displayFlight();

    }
}
