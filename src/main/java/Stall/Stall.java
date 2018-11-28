package Stall;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

//    name, ownerName, parkingSpot
    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }
}
