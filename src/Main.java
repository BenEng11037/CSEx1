public class Main {
    public static void main(String[] args) {
        Animal animalOne = new Animal("Nemo", "Goldfish", 2000, 4.3, 65.4, 3.25, false);
        Animal animalTwo = new Animal("Nemo", "Goldfish", 2000, 4.3, 65.4, 3.25, true);
        Animal animalThree = new Animal("Nemo", "Goldfish", 2000, 4.3, 65.4, 3.25, true);
        Animal animalTest = new Animal("Nemo", "Goldfish", 2000, 4.3, 65.4, 3.25, false);
        System.out.println(animalOne.toString());
        System.out.println(animalTest.toString());
        ZooHabitat zoo = new ZooHabitat(animalOne, animalTwo, animalThree);
        System.out.println(zoo.removeAnimal(animalTest));
        ZooHabitat zoo2 = new ZooHabitat();
        System.out.println(zoo2.addAnimal(animalTest));
    }
}