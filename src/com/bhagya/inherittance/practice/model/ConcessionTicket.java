package com.bhagya.inherittance.practice.model;

public class ConcessionTicket extends Ticket {

    int concessionTicketAmount = 0;
    int AgrProofId;

    public ConcessionTicket(int concessionTicketAmount, int agrProofId) {
        this.concessionTicketAmount = concessionTicketAmount;
        this.AgrProofId = agrProofId;
    }

    public ConcessionTicket() {

    }
}
