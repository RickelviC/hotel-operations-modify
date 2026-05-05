package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public boolean checkIn(){
        if (isAvailable()){
            isOccupied = true;
            isDirty = true;
        }
        return isOccupied && isDirty;
    }

    public boolean checkOut(){
        if (!isAvailable()){
            isOccupied = false;
            return isOccupied;
        }
        return !isOccupied;
    }


    public boolean cleanRoom(){
        if (!isOccupied){
            return isDirty;
        }
        return !isDirty;
    }
}