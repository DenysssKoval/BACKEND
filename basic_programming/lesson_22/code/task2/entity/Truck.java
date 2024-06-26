package code.task2.entity;

public class Truck extends Vehicle{

    public Truck(String vin, String brand, String model, int year) {
        super(vin, brand, model, year);
    }

    @Override
    public void showInfo() {
        System.out.println("Truck: VIN = " + getVin() + ", " + getBrand() + ", " + getModel() + "(" + getYear() + ")");
    }
}
