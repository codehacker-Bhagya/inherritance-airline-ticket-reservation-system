package com.bhagya.inherittance.practice.controller;

import com.bhagya.inherittance.practice.service.FlightService;
import com.bhagya.inherittance.practice.service.TicketService;

public class TicketController {

    private final TicketService ticketService = new TicketService();
    private final FlightService flightService = new FlightService();

    public void Ticketdata(){
        flightService.displayFlight();
        ticketService.displayTicket();
        ticketService.TicketBooking();

    }
}
