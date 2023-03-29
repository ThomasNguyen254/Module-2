package CaseStudy;

public class Customer extends Person{
    private String typeOfCustomer;
    private String address;

    public Customer(String id, String fullName, int age, String address, String typeOfCustomer, String address1) {
        super(id, fullName, age, address);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address1;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
