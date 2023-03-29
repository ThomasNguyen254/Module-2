package CaseStudy;

public class Villa extends Facility{
    private String roomStandard;
    private String convenientDescription;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa(String id, String name, String address, double area, double rentalCost, int maxNumberOfGuests, String roomStandard, String convenientDescription, double swimmingPoolArea, int numberOfFloors) {
        super(id, name, address, area, rentalCost, maxNumberOfGuests);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.swimmingPoolArea = swimmingPoolArea;
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

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
