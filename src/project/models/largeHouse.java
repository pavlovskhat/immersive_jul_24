package project.models;

public class largeHouse extends House {

    boolean hasGarage;

    public largeHouse(
            int numberOfRooms,
            String colour,
            int powerRead
    ) {
        super(
            numberOfRooms,
            colour,
            powerRead
        );
        this.hasGarage = true;
    }
}
