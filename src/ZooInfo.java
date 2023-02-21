import java.util.Scanner;

public class ZooInfo {
    public static String INTRO = "Welcome to the ZooInfo program!";
    public static String NAME_PROMPT = "What is the animal's name?";
    public static String SPECIES_PROMPT = "What is the animal's species?";
    public static String COUNTRY_PROMPT = "Where is the animal from?";
    public static String BIRTH_PROMPT = "What year was the animal (in yyyy form) born?";
    public static String YEARS_AT_ZOO_PROMPT = "How many years has the animal been at the zoo?";
    public static String HABITAT_TYPE_PROMPT = "Does the the animal need to be kept in a tank, cage, or free-roam?";
    public static String WEATHER_PROMPT = "Does the animal prefer hot or cold weather?";
    public static String CARETAKER_NUMBER_PROMPT = "How many people regularly take care of the animal?";
    public static String ITH_PERSON_PROMPT = "What is the name of person number ";
    public static String FOOD_PROMPT = "How much food does the animal eat in a day?";

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println(INTRO);

        System.out.println(NAME_PROMPT);
        String name = scanner.nextLine();
        name = name.toUpperCase();
        result += name + "_";

        System.out.println(SPECIES_PROMPT);
        String species = scanner.nextLine();

        System.out.println(COUNTRY_PROMPT);
        String country = scanner.nextLine();

        String speCoun = species.substring(0, 1) + species.substring(species.length() - 1, species.length()) + country.substring(0, 3);
        speCoun = speCoun.toUpperCase();
        result += speCoun + "_";

        System.out.println(BIRTH_PROMPT);
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        int lastBirthYear = birthYear % 100;
        result += lastBirthYear + "_";

        System.out.println(YEARS_AT_ZOO_PROMPT);
        int zooYear = scanner.nextInt();
        scanner.nextLine();
        result += zooYear + "_";

        System.out.println(HABITAT_TYPE_PROMPT);
        String habitat = scanner.nextLine();
        String habitatType = "";
        if (habitat.equalsIgnoreCase("tank")) {
            habitatType = "TK";

        } else if (habitat.equalsIgnoreCase("cage")) {
            habitatType = "CG";
        } else if (habitat.equalsIgnoreCase("free-roam")) {
            habitatType = "FR";
        }
        result += habitatType + "_";

        System.out.println(WEATHER_PROMPT);
        String weather = scanner.nextLine();
        String weatherType = "";
        if (weather.equals("hot")) {
            weatherType = "H";
        } else {
            weatherType = "C";
        }
        result += weatherType + "_CARE{";

        System.out.println(CARETAKER_NUMBER_PROMPT);
        int numCaretakers = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[numCaretakers];
        for (int i = 0; i < numCaretakers; i++) {
            System.out.println(ITH_PERSON_PROMPT + (i + 1) + "?");
            arr[i] = scanner.nextLine();
            if (i == numCaretakers - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ", ";
            }
        }
        result += "}_";

        System.out.println(FOOD_PROMPT);
        String foodAmount = scanner.nextLine();
        int space = foodAmount.indexOf(" ");
        String toParse = foodAmount.substring(0, space);
        double weight = Double.parseDouble(toParse);
        String foodCat = "";
        if (weight > 20.0) {
            foodCat = "LOT";
        } else if (weight >= 5.0) {
            foodCat = "AVERAGE";
        } else {
            foodCat = "LITTLE";
        }
        result += foodCat;

        System.out.println(result + ";");

    }


}
