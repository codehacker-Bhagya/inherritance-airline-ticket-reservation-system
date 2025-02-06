package com.bhagya.inherittance.practice.controller;

import com.bhagya.inherittance.practice.service.ConcessionTicketService;

public class ConcessionTicketController {

    private final ConcessionTicketService concessionTicketService = new ConcessionTicketService();

    public void concessionTicketBooking(){
        concessionTicketService.concessionTicket();
        concessionTicketService.TicketBooking();
    }
}
