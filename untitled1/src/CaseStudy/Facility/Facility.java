package CaseStudy;

public abstract class Facility {
    private String id;
    private String name;
    private String address;
    private double area;
    private double rentalCost;
    private int maxNumberOfGuests;

    public Facility(String id, String name, String address, double area, double rentalCost, int maxNumberOfGuests) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxNumberOfGuests = maxNumberOfGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfGuests() {
        return maxNumberOfGuests;
    }

    public void setMaxNumberOfGuests(int maxNumberOfGuests) {
        this.maxNumberOfGuests = maxNumberOfGuests;
    }
}
