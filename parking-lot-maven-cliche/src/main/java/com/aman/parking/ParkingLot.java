package com.aman.parking;

import java.io.IOException;

import com.aman.parking.commands.ParkingLotCommands;
import com.budhash.cliche.ShellFactory;

public class ParkingLot {
    public static void main(String[] args) {
        ParkingLotCommands parkingLotCommands = new ParkingLotCommands();
        try {
            ShellFactory.createConsoleShell("parking-lot", "", parkingLotCommands).commandLoop();
        } catch (IOException ioException) {
            System.out.println(
                    "Exception Occured While Creating Interactive Command Prompt : " + ioException.getMessage());
        }
    }
}
