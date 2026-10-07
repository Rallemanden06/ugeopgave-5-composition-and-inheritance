import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Building building = new Building("AA");

        Room room1 = new Room("A1");
        room1.addLamp(new Lamp(40));
        room1.addLamp(new Lamp(40));
        room1.addWindow(new Window(120,90));

        Room room2 = new Room("A2");
        room2.addLamp(new Lamp(30));
        room2.addLamp(new Lamp(30));
        room2.addWindow(new Window(60,60));

        Room room3 = new Room("A3");
        room3.addLamp(new Lamp(20));
        room3.addLamp(new Lamp(20));
        room3.addWindow(new Window(90,120));

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        building.printBuilding();

    }
}
