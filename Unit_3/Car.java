package Unit_3;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String toString(){
        return ("the make of the car is " + make + ", the model is " + model + ", and the year is " + year + ".");
    }
}
