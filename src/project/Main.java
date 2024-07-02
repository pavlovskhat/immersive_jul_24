package project;
import project.models.*;

public class Main {
    public static void main(String[] args) {

        House myHouse = new House(3, "White", 100);
        largeHouse myLargeHouse = new largeHouse(6, "Grey", 250);
        myHouse.ringDoorbell();
        myLargeHouse.setPowerRead(50);
    }
}
