public class Contest {
    private Animal animal1;
    private Animal animal2;
    private int round;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.round = 0;
    }

    public void playRound() {
        round++;

        System.out.println("--- Runde " + round + " ---");

        if (animal1.isActive() && animal2.isActive()) {
            int damage = animal1.attack();

            animal2.setEnergy(animal2.getEnergy() - damage);

            if (animal2.getEnergy() - damage < 0){
                animal2.setEnergy(0);
            }

            System.out.println(animal1.getName() + " angriber " + animal2.getName() + " for " + damage + "! (" + animal2.getName()
                    + " har " + animal2.getEnergy() + " energi tilbage)"
            );
        }

        if (animal2.isActive() && animal1.isActive()) {
            int damage = animal2.attack();

            animal1.setEnergy(animal1.getEnergy() - damage);

            if (animal2.getEnergy() - damage < 0){
                animal2.setEnergy(0);
            }

            System.out.println(animal2.getName() + " angriber " + animal1.getName() + " for " + damage + "! (" + animal1.getName()
                    + " har " + animal1.getEnergy() + " energi tilbage)"
            );
        }
        System.out.println();
    }

    public Animal getWinner() {
        if (!animal1.isActive() && animal2.isActive()) {
            return animal2;
        }

        if (!animal2.isActive() && animal1.isActive()) {
            return animal1;
        }

        return null;
    }

}