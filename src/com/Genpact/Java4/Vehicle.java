package com.Genpact.Java4;

public class Vehicle {

    public String Make;
    public String Model;
    public int Year;
    public String Fuel_Type;

    public Vehicle(String make, String model, int year, String fuel_Type) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Fuel_Type = fuel_Type;
    }

    public float Cal_Fuel_Efficiency() {
        return Cal_Fuel_Efficiency();
    }

    public double Cal_Distance_Travel() {
        return 2359.7;
    }

    public int Max_Speed() {
        return Max_Speed();
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public String getFuel_Type() {
        return Fuel_Type;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuel_Type) {
        super(make, model, year, fuel_Type);
    }

    public float Cal_Fuel_Efficiency() {
        return 13.0F;
    }

    public int Max_Speed() {
        return 80;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public float Cal_Fuel_Efficiency() {
        return 18.0F;
    }

    public int Max_Speed() {
        return 160;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public float Cal_Fuel_Efficiency() {
        return 50.0F;
    }

    public int Max_Speed() {
        return 150;
    }
}

class main2 {
    public static void main(String[] args) {
        Vehicle truck = new Truck("TATA", "407", 1980, "Diesel");
        Vehicle car = new Car("Honda", "City", 2019, "Petrol");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020, "Petrol");

        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " " + truck.getYear() + " " + truck.getFuel_Type());
        System.out.println("Fuel Efficiency: " + truck.Cal_Fuel_Efficiency() + " Kilometer per Liters");
        System.out.println("Distance Traveled with 10 Liters of fuel: " + truck.Cal_Fuel_Efficiency() * 10 + " Kilometers");
        System.out.println("Max Speed: " + truck.Max_Speed() + " Km/h");

        System.out.println("\nCar: " + car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.getFuel_Type());
        System.out.println("Fuel Efficiency: " + car.Cal_Fuel_Efficiency() + " Kilometers per Liters");
        System.out.println("Distance Traveled with 10 Liters of fuel: " + car.Cal_Fuel_Efficiency() * 10  + " Kilometers");
        System.out.println("Max Speed: " + car.Max_Speed() + " Km/h");

        System.out.println("\nMotorcycle: " + motorcycle.getMake() + " " + motorcycle.getModel() + " " + motorcycle.getYear() + " " + motorcycle.getFuel_Type());
        System.out.println("Fuel Efficiency: " + motorcycle.Cal_Fuel_Efficiency() + " Kilometers per Liters");
        System.out.println("Distance Traveled with 10 Liters of fuel: " + motorcycle.Cal_Fuel_Efficiency() * 10 + " Kilometers");
        System.out.println("Max Speed: " + motorcycle.Max_Speed() + " Km/h");
    }
}


