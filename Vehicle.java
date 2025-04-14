package AMS;

// Class 1: Vehicle
public class Vehicle {
    private long id;
    private String name;
    private String model;
    private int age;
    private int mileage;

    public Vehicle(long id, String name, String model, int age, int mileage) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Model: " + model +
                ", Age: " + age + " years, Mileage: " + mileage + " km";
    }
}

