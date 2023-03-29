package CaseStudy;

public class House extends Facility {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House(String id, String name, String address, double area, double rentalCost, int maxNumberOfGuests, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, name, address, area, rentalCost, maxNumberOfGuests);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
