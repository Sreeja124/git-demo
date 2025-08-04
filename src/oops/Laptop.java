package oops;

public class Laptop {
    public String brand;
    public String model;
    public int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        String Year= String.valueOf(year);
        return Year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
