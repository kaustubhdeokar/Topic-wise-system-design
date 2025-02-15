import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        PaymentFactory vehicleFactory = new PaymentFactory();
        vehicleFactory.createVehicle(new TwoWheeler()); 
        
    }
}

