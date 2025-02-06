package com.bhagya.inherittance.practice;

import com.bhagya.inherittance.practice.controller.*;

import java.util.Scanner;

import static com.bhagya.inherittance.practice.service.PassengerService.scanner;


public class InherritanceAirlineTicketbookingSystemDemo {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int option = 0;
        do  {

            System.out.println("Welcome to Airline booking System");
            System.out.println("Enter your option");
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. For Concession Ticket");
            System.out.println("5. Billing And Cancellation details");
            System.out.println("0. Exit ");


            option = Integer.parseInt(scanner.nextLine());

            switch (option) {

                case 1:

                PassengerController passengerController = new PassengerController();
                passengerController.createPassenger();
            }break;

            switch (option){

                case 2:
                FlightController flightController = new FlightController();
                flightController.printFlight();

            }

            break;

            switch(option){
                case 3:
                TicketController ticketController = new TicketController();
                ticketController.Ticketdata();

            }break;

            switch(option) {

                case 4:

                    ConcessionTicketController concessionTicketController = new ConcessionTicketController();
                    concessionTicketController.concessionTicketBooking();

            }break;

            switch (option){

                case 5:

                 BillingAndCancellationController billingAndCancellationController = new BillingAndCancellationController();
                 billingAndCancellationController.TotalBillingData();
            }

        System.out.println("Tnank You");

    }while (option != 0);
}

}