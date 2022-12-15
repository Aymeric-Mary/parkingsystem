package com.parkit.parkingsystem.service;

import com.parkit.parkingsystem.constants.Fare;
import com.parkit.parkingsystem.model.Ticket;

import java.time.ZoneOffset;

public class FareCalculatorService {

    public void calculateFare(Ticket ticket) {
        if ((ticket.getOutLocalDateTime() == null) || (ticket.getOutLocalDateTime().isBefore(ticket.getInLocalDateTime()))) {
            throw new IllegalArgumentException("Out time provided is incorrect:" + ticket.getOutLocalDateTime().toString());
        }

        long inTime = ticket.getInLocalDateTime().toEpochSecond(ZoneOffset.UTC);
        long outTime = ticket.getOutLocalDateTime().toEpochSecond(ZoneOffset.UTC);

        double nbHours =((double) (outTime - inTime)) / 60 / 60;

        switch (ticket.getParkingSpot().getParkingType()) {
            case CAR: {
                ticket.setPrice(nbHours * Fare.CAR_RATE_PER_HOUR);
                break;
            }
            case BIKE: {
                ticket.setPrice(nbHours * Fare.BIKE_RATE_PER_HOUR);
                break;
            }
            default:
                throw new IllegalArgumentException("Unknown Parking Type");
        }
    }
}