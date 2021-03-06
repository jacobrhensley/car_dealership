package dealership;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private Boolean finance;

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

    public double getCashOnHand() {

        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public boolean getFinance() {

        return finance;
    }

    public void setFinance (boolean finance) {
        this.finance = finance;
    }

    
public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
    emp.handleCustomer(this, finance, vehicle);
}
    
}