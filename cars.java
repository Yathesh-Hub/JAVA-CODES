class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }
}
class Bike extends Vehicle {
    private String type;

    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
public class cars {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Bike bike = new Bike("Harley-Davidson", "Sportster", "Cruiser");
        System.out.println(car);
        System.out.println(bike);
    }
}

