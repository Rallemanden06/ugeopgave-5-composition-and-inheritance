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

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Balto", 70));
        animals.add(new Rabbit("Bunny", 100));
        animals.add(new Rabbit("Hopper", 90));

        playContest(animals.get(0), animals.get(1));

        playContest(animals.get(2), animals.get(3));
    }

    public static void playContest(Animal animal1, Animal animal2) {

        System.out.println("================================");
        System.out.println("Fight: " + animal1.getName()
                + " mod " + animal2.getName());
        System.out.println("================================");

        Contest contest = new Contest(animal1, animal2);

        while (animal1.isActive() && animal2.isActive()) {
            contest.playRound();
        }

        Animal winner = contest.getWinner();

        if (winner != null) {
            System.out.println("Vinderen: " + winner);
        } else {
            System.out.println("Ingen vinder.");
        }

        System.out.println();
    }
}
