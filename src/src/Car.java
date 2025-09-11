public class Car {
    private final String brand;
    private final String model;
    private final String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nBrand = " + brand + " \nModel = " + model + " \nColor = " + color;
    }
}
