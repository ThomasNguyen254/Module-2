package CaseStudy;

public class Room extends Facility{
    private String freeServices;

    public Room(String id, String name, String address, double area, double rentalCost, int maxNumberOfGuests, String freeServices) {
        super(id, name, address, area, rentalCost, maxNumberOfGuests);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
}
