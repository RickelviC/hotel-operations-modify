package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2,99);
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());
        System.out.println("========================================================");

        if (room.checkIn()){
            room.checkOut();
        }
        System.out.println("Is Available: " + room.isAvailable());
    }
}
