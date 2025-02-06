package com.bhagya.inherittance.practice.model;

public class Flight {

    private String FlightName;
    private int FlightNo;
    private int FlightTime;
    private String Destination;
    private String Status;

    public Flight(String flightName, int flightNo, int flightTime, String destination, String status) {
        this.FlightName = flightName;
        this.FlightNo = flightNo;
        this.FlightTime = flightTime;
        this.Destination = destination;
        this.Status = status;
    }

    public Flight() {

    }
}
