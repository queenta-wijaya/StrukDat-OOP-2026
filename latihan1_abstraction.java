public class latihan1_abstraction {
    public static void main(String[] args){
        Car myCar = new ElectricCar("Wuling", "Biru");
        myCar.displayInfo();
        System.out.println();
    }
}

abstract class Car {
    protected String brand;
    protected String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    abstract void startEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Warna: " + color);
    }
}

class ElectricCar extends Car {
    public ElectricCar(String brand, String color){
        super(brand, color);
    }
    @Override
    void startEngine(){
        System.out.println("Ini adalah Mobil Elektrik");
    }
}