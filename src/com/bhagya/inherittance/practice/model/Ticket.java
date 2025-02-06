package com.bhagya.inherittance.practice.model;

public class Ticket extends Flight{


    private String seatPreference;
    private String destination;
    private String AddMeal;
    private double TicketAmount;

    public Ticket() {
        super();
        this.seatPreference = seatPreference;
        this.destination = destination;
        this.AddMeal = AddMeal;
        this.TicketAmount = TicketAmount;
    }

    public void TicketInfo(){

        System.out.println("Seat Prefarence" + seatPreference + "Destnation" + destination + "Do You Want Add Meai" + AddMeal + "your Ticket Ammount" + TicketAmount);
    }
}
