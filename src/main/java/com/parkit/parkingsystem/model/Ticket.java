package com.parkit.parkingsystem.model;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private LocalDateTime inLocalDateTime;
    private LocalDateTime outLocalDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getInLocalDateTime() {
        return inLocalDateTime;
    }

    public void setInLocalDateTime(LocalDateTime inLocalDateTime) {
        this.inLocalDateTime = inLocalDateTime;
    }

    public LocalDateTime getOutLocalDateTime() {
        return outLocalDateTime;
    }

    public void setOutLocalDateTime(LocalDateTime outLocalDateTime) {
        this.outLocalDateTime = outLocalDateTime;
    }
}
