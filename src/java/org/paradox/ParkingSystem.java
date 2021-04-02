package org.paradox;

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
public class ParkingSystem {
    private int smallParkingSpots;
    private int mediumParkingSpots;
    private int bigParkingSpots;

    public ParkingSystem(int big, int medium, int small) {
        smallParkingSpots = small;
        mediumParkingSpots = medium;
        bigParkingSpots = big;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigParkingSpots > 0){
                    bigParkingSpots--;
                    return true;
                }
                return false;
            case 2:
                if (mediumParkingSpots > 0){
                    mediumParkingSpots--;
                    return true;
                }
                return false;
            case 3:
                if (smallParkingSpots > 0){
                    smallParkingSpots--;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

}
