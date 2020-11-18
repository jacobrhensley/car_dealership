package dealership;

public class Employee {
    
    private String name;
    private Integer employeeNumber;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmployeeNumber(Integer employeeNumber){
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber(){
        return employeeNumber;
    }

    public void runCreditHistory(Customer cust, double priceDifference){
        System.out.println("Running credit check");
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance == true){
            runCreditHistory(cust, vehicle.getPrice() - cust.getCashOnHand());
        } else if(vehicle.getPrice() <= cust.getCashOnHand()){
            vehicle.setOwner(cust);
            System.out.println( cust.getName() + ", you are now the proud owner of a " + vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel());
        } else{
            System.out.println("Im sorry, you do not have enough money. Please come back when youy have $" + vehicle.getPrice());
        }
    }
}
