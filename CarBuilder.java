public class CarBuilder implements Builder {
    private String brand;
    private String model;
    private String color;

    @Override
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public void setModel(String model) { this.model = model; }

    @Override
    public void setColor(String color) { this.color = color; }
    public Car build() { return new Car(brand, model, color); }
}
