package com.aman.parking.commands;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aman.parking.backend.DBConnection;
import com.budhash.cliche.Command;
import com.budhash.cliche.Param;

public class ParkingLotCommands {

    private int carId = 1;

    @Command(name = "create_parking_lot", description = "Creates a parking lot with given slots.")
    public String createParkingLot(@Param(name = "slots", description = "Number of slots for parking lot") int slots) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String sqlQueryCar = "CREATE TABLE car (car_id INTEGER NOT NULL AUTO_INCREMENT, registration_number VARCHAR(255) NOT NULL, color VARCHAR(255) NOT NULL, PRIMARY KEY (car_id))";
            String sqlQueryParking = "CREATE TABLE parking (parking_id INTEGER NOT NULL, car_id INTEGER, parking_status TINYINT(1), PRIMARY KEY (parking_id))";
            statement.executeUpdate(sqlQueryCar);
            statement.executeUpdate(sqlQueryParking);
            for (int i = 0; i < slots; i++) {
                String createSlotQuery = "INSERT INTO parking VALUES (" + (i + 1) + ", null, 0)";
                statement.executeUpdate(createSlotQuery);
            }
            output = "Created a parking lot with " + slots + " slots";
        } catch (SQLException sqlException) {
            output = "Failed to create parking lot !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Failed to create parking lot !!!";
            System.out.println("Exception occured in ParkingLotCommands: createParkingLot() " + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "park", description = "Park a car by specifying registration number and colour.")
    public String parkCar(
            @Param(name = "registration_number", description = "Registration number (number plate) of the car") String registratonNumber,
            @Param(name = "colour", description = "Colour of the car") String colour) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String addCarQuery = "INSERT INTO car VALUES (" + carId + ",'" + registratonNumber + "','" + colour + "')";
            String parkCarQuery = "UPDATE parking SET car_id=" + carId
                    + ", parking_status=1 WHERE parking_id=(SELECT parking_id FROM parking WHERE parking_status=0 LIMIT 1)";
            statement.executeUpdate(addCarQuery);
            statement.executeUpdate(parkCarQuery);
            String getSlotNumberQuery = "SELECT parking_id FROM parking WHERE car_id=" + carId;
            ResultSet resultSet = statement.executeQuery(getSlotNumberQuery);
            resultSet.next();
            int slotNumber = resultSet.getInt("parking_id");
            output = "Allocated slot number: " + slotNumber;
            carId++;
        } catch (SQLException sqlException) {
            output = "Sorry, parking lot is full";
        } catch (Exception exception) {
            output = "Cannot allocate slot number !!!";
            System.out.println("Exception occured in ParkingLotCommands: parkCar() " + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "leave", description = "Empty occupied slot number")
    public String vacantSlot(@Param(name = "slot_number", description = "Occupied slot number") int slotNumber) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String vacantSlotQuery = "UPDATE parking SET parking_status=0 WHERE parking_id=" + slotNumber;
            statement.executeUpdate(vacantSlotQuery);
            output = "Slot number " + slotNumber + " is free";
        } catch (SQLException sqlException) {
            output = "Failed to vacate slot number !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Cannot vacate slot number !!!";
            System.out.println("Exception occured in ParkingLotCommands: vacantSlot() " + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "status", description = "Parking lot status")
    public String parkingLotStatus() {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String statusQuery = "SELECT p.parking_id, c.registration_number, c.color FROM parking p JOIN car c ON p.car_id=c.car_id WHERE p.parking_status=1 ORDER BY p.parking_id";
            ResultSet resultSet = statement.executeQuery(statusQuery);
            StringBuilder status = new StringBuilder();
            status.append("Slot No.     Registration No     Color");
            while (resultSet.next()) {
                int slotNumber = resultSet.getInt("parking_id");
                String registrationNumber = resultSet.getString("registration_number");
                String color = resultSet.getString("color");
                status.append("\n" + slotNumber + "            " + registrationNumber + "        " + color);
            }
            output = status.toString();
        } catch (SQLException sqlException) {
            output = "Failed to get status !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Cannot get status !!!";
            System.out.println("Exception occured in ParkingLotCommands: parkingLotStatus() " + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "registration_numbers_for_cars_with_colour", description = "Gives registration number of all cars of specified color.")
    public String getRegistrationNumbersForCarsWithColour(
            @Param(name = "color", description = "Color of the car") String color) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String getQuery = "SELECT c.registration_number FROM car c JOIN parking p WHERE c.color='" + color
                    + "' AND p.parking_status=1";
            ResultSet resultSet = statement.executeQuery(getQuery);
            StringBuilder regNumbers = new StringBuilder();
            while (resultSet.next()) {
                String registrationNumber = resultSet.getString("registration_number");
                regNumbers.append(registrationNumber + ", ");
            }
            output = regNumbers.toString();
        } catch (SQLException sqlException) {
            output = "Failed to get registration numbers !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Cannot get registration numbers !!!";
            System.out.println("Exception occured in ParkingLotCommands: getRegistrationNumbersForCarsWithColour() "
                    + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "slot_numbers_for_cars_with_colour", description = "Gives slot number of all cars of specified color.")
    public String getSlotNumbersForCarsWithColour(
            @Param(name = "color", description = "Color of the car") String color) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String getQuery = "SELECT p.parking_id FROM parking p JOIN car c ON c.car_id=p.car_id WHERE c.color='"
                    + color + "' AND p.parking_status=1";
            ResultSet resultSet = statement.executeQuery(getQuery);
            StringBuilder slotNumbers = new StringBuilder();
            while (resultSet.next()) {
                String slotNumber = resultSet.getString("parking_id");
                if (slotNumber == null || slotNumber.isEmpty()) {
                    continue;
                }
                slotNumbers.append(slotNumber + ", ");
            }
            output = slotNumbers.toString();
        } catch (SQLException sqlException) {
            output = "Failed to get slot numbers !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Cannot get slot numbers !!!";
            System.out.println("Exception occured in ParkingLotCommands: getSlotNumbersForCarsWithColour() "
                    + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }

    @Command(name = "slot_number_for_registration_number", description = "Gives slot number of all cars of specified registration number.")
    public String getSlotNumbersForRegistrationNumber(
            @Param(name = "registration_number", description = "Registration number of the car") String registrationNumber) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.createConnection();
        String output = null;
        try {
            statement = connection.createStatement();
            String getQuery = "SELECT p.parking_id FROM parking p JOIN car c ON c.car_id=p.car_id WHERE c.registration_number='"
                    + registrationNumber + "' AND p.parking_status=1";
            ResultSet resultSet = statement.executeQuery(getQuery);
            StringBuilder slotNumbers = new StringBuilder();
            resultSet.next();
            String slotNumber = resultSet.getString("parking_id");
            if (slotNumber == null || slotNumber.isEmpty()) {
                slotNumbers.append("Not found");
            } else {
                slotNumbers.append(slotNumber);
            }
            output = slotNumbers.toString();
        } catch (SQLException sqlException) {
            output = "Failed to get slot numbers !!!";
            System.out.println("Exception occurred while creating statement: " + sqlException.getMessage());
        } catch (Exception exception) {
            output = "Cannot get slot numbers !!!";
            System.out.println("Exception occured in ParkingLotCommands: getSlotNumbersForRegistrationNumber() "
                    + exception.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing resource statement: " + sqlException.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Exception occured while closing database connection: " + sqlException.getMessage());
            }
        }
        return output;
    }
}