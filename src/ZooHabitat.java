public class ZooHabitat {
    private Animal animalOne;
    private Animal animalTwo;
    private Animal animalThree;

    private Animal[] arr = new Animal[3];

    public ZooHabitat(Animal animalOne, Animal animalTwo, Animal animalThree) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.animalThree = animalThree;
        arr[0] = this.animalOne;
        arr[1] = this.animalTwo;
        arr[2] = this.animalThree;
    }

    public ZooHabitat() {
        this.animalOne = null;
        this.animalTwo = null;
        this.animalThree = null;
        arr[0] = this.animalOne;
        arr[1] = this.animalTwo;
        arr[2] = this.animalThree;
    }

    public boolean addAnimal(Animal animal) {
        boolean bol = false;
        if (animalOne == null) {
            animalOne = animal;
            bol = true;
        } else if (animalTwo == null) {
            animalTwo = animal;
            bol = true;
        } else if (animalThree == null) {
            animalThree = animal;
            bol = true;
        }
        return bol;
    }

    public boolean removeAnimal(Animal animal) {
        boolean bol = false;
        if ((animalOne.getYear()) == animal.getYear() && (animalOne.getSpecies()).equals(animal.getSpecies()) && (animalOne.getName()).equals(animal.getName())) {
            animalOne = null;
            bol = true;
        } else if ((animalTwo.getYear()) == animal.getYear() && (animalTwo.getSpecies()).equals(animal.getSpecies()) && (animalTwo.getName()).equals(animal.getName())) {
            animalTwo = null;
            bol = true;
        } else if ((animalThree.getYear()) == animal.getYear() && (animalThree.getSpecies()).equals(animal.getSpecies()) && (animalThree.getName()).equals(animal.getName())) {
            animalThree = null;
            bol = true;
        }
        return bol;
    }

    public int getAvailableSpace() {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == null) {
                k++;
            }
        }
        return k;
    }

    public int getAnimalCount() {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] != null) {
                k++;
            }
        }
        return k;
    }

    public double calculateTotalMaintenanceCost() {
        double k = 0.0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] != null) {
                k = k + arr[i].getMaintenanceCost();
            }
        }
        return k;
    }

    public double getAverageAge() {
        double k = 0;
        double numAni = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] != null) {
                k = k + (2023 - arr[i].getYear());
                numAni++;
            }
        }
        return (k / numAni);
    }
}
