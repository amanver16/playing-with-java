package com.aman.parking;

import static org.junit.Assert.assertEquals;

import com.aman.parking.commands.ParkingLotCommands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotCommandsTest {

    private ParkingLotCommands parkingLotCommands;

    @Before
    public void init() {
        parkingLotCommands = new ParkingLotCommands();
    }

    @Test
    public void testCreateParkingLot() {
        int slots = 6;
        String expectedResult = "Created a parking lot with " + slots + " slots";
        String actualResult = parkingLotCommands.createParkingLot(slots);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testParkCar() {
        String registrationNumber = "KA-01-HH-1234";
        String color = "White";
        String expectedResult = "Allocated slot number: 1";
        String actualResult = parkingLotCommands.parkCar(registrationNumber, color);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVacantSlot() {
        int slotNumber = 1;
        String expectedResult = "Slot number " + slotNumber + " is free";
        String actualResult = parkingLotCommands.vacantSlot(slotNumber);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void end() {
        parkingLotCommands = null;
    }
}
