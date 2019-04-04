public class Bird {
    private String name;
    private String latinName;
    private int timesObserved;


    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.timesObserved = 0;
    }
    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setTimesObserved() {
        this.timesObserved++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.timesObserved + " observations";
    }
}
