public class Animal {
    private String name;
    private String species;
    private int year;
    private double topSpeed;
    private double idealTemperature;
    private double maintenanceCost;
    private boolean nocturnal;

    public Animal(String name, String species, int year, double topSpeed, double idealTemperature, double maintenanceCost, boolean nocturnal) {
        this.name = name;
        this.species = species;
        this.year = year;
        this.topSpeed = topSpeed;
        this.idealTemperature = idealTemperature;
        this.maintenanceCost = maintenanceCost;
        this.nocturnal = nocturnal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getIdealTemperature() {
        return idealTemperature;
    }

    public void setIdealTemperature(double idealTemperature) {
        this.idealTemperature = idealTemperature;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public String toString() {
        String fTopSpeed = String.format("%.2f", topSpeed);
        String fIdealTemp = String.format("%.2f", idealTemperature);
        String fMainCost = String.format("%.2f", maintenanceCost);
        String noctuBol = "";
        if (nocturnal){
            noctuBol = "True";
        }else{
            noctuBol = "False";
        }
        return "Animal<name=" + name + ", species=" + species + ", year=" + year + ", topSpeed=" + fTopSpeed + ", idealTemperature=" + fIdealTemp + ", maintenanceCost=" + fMainCost+ ", nocturnal=" + noctuBol + ">";
    }
}

