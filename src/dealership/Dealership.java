package dealership;

public class Dealership {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything St. ");
        cust1.setCashOnHand(12000);

        Employee emp1 = new Employee();
        emp1.setName("Bill");
        emp1.setEmployeeNumber(00001);

        Vehicle veh1 = new Vehicle();
        veh1.setYear("2007");
        veh1.setMake("GMC");
        veh1.setModel("Sierra");
        veh1.setPrice(8000);

        cust1.purchaseCar(veh1, emp1, false); 
        
    }
    
}
