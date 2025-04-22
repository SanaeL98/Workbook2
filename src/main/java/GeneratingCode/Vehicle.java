package GeneratingCode;

public class Vehicle {
    public static void main(String[] args) {
        
    }

    private int id;
    private String makeModel;
    private int year;
    private double price;

    public Vehicle(int id, String makeModel, int year, double price) {
        this.id = id;
        this.makeModel = makeModel;
        this.year = year;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Vehicle ID: " + id +
                ", Make & Model: " + makeModel +
                ", Year: " + year +
                ", Price: $" + price;
    }
}
