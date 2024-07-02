package project.models;
import project.interfaces.Blueprint;

public class House implements Blueprint {

    int numberOfRooms;
    String colour;
    int powerRead;

    public House(
            int numberOfRooms,
            String colour,
            int powerRead
    ) {
        this.numberOfRooms = numberOfRooms;
        this.colour = colour;
        this.powerRead = powerRead;
    }

    @Override
    public void ringDoorbell() {
        System.out.println("Welcome!");
    }

    @Override
    public void paintHouse(String newColour) {
        this.colour = newColour;
        System.out.println("The house is now " + newColour);
    }

    @Override
    public int getPowerRead() {
        return powerRead;
    }

    @Override
    public void setPowerRead(int newPowerRead) {
        this.powerRead += newPowerRead;
        System.out.println("You have " + powerRead + "kWh units remaining!");
    }
}
