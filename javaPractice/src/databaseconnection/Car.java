package databaseconnection;

public class Car {
    private int id;
    private String model;
    private long year;
    private int numOfHorses;


    public Car(int id, String model, long year, int numOfHorses) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.numOfHorses = numOfHorses;
    }

    public int getId() { return id; }

    public void setId(String brand) {this.id = id;}

    public String getModel() { return model;}

    public void setModel(String model) { this.model = model;}

    public long getYear() { return year;}

    public void setYear(long year) { this.year = year;}

    public int getNumOfHorses() {return numOfHorses;}

    public void setNumOfHorses(int numOfHorses) { this.numOfHorses = numOfHorses;}
}
