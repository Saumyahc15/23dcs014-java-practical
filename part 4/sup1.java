import java.util.Scanner;

class Vehicle {
    String brand, model, fuel_type;
    int year;

    Vehicle(String brand, String model, int year, String fuel_type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }

    int Fuel_efficiency() {
        return 0;
    }

    int Distance_travelled(int Fuel_consumed) {
        return Fuel_consumed * Fuel_efficiency();
    }

    int Max_speed() {
        return 0;
    }
}

class Truck extends Vehicle {
    Truck(String brand, String model, int year, String fuel_type) {
        super(brand, model, year, fuel_type);
    }

    @Override
    int Fuel_efficiency() {
        return 20;
    }

    @Override
    int Distance_travelled(int Fuel_consumed) {
        return Fuel_consumed * Fuel_efficiency();
    }

    @Override
    int Max_speed() {
        return 120;
    }
}

class Car extends Vehicle {
    Car(String brand, String model, int year, String fuel_type) {
        super(brand, model, year, fuel_type);
    }

    @Override
    int Fuel_efficiency() {
        return 30;
    }

    @Override
    int Distance_travelled(int Fuel_consumed) {
        return Fuel_consumed * Fuel_efficiency();
    }

    @Override
    int Max_speed() {
        return 160;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand, String model, int year, String fuel_type) {
        super(brand, model, year, fuel_type);
    }

    @Override
    int Fuel_efficiency() {
        return 50;
    }

    @Override
    int Distance_travelled(int Fuel_consumed) {
        return Fuel_consumed * Fuel_efficiency();
    }

    @Override
    int Max_speed() {
        return 190;
    }
}

public class sup1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (Truck, Car, Motorcycle): ");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Enter fuel type: ");
        String fuelType = scanner.next();

        Vehicle vehicle;

        if (vehicleType.equals("Truck")) {
            vehicle = new Truck(make, model, year, fuelType);
        } else if (vehicleType.equals("Car")) {
            vehicle = new Car(make, model, year, fuelType);
        } else if (vehicleType.equals("Motorcycle")) {
            vehicle = new Motorcycle(make, model, year, fuelType);
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        System.out.println("Fuel efficiency: " + vehicle.Fuel_efficiency() + " km/l");
        System.out.println("Distance traveled (assuming 10 liters of fuel consumed): " + vehicle.Distance_travelled(10) + " km");
        System.out.println("Maximum speed: " + vehicle.Max_speed() + " km/h");
    }
}
