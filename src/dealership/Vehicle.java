package dealership;

public class Vehicle {
    
    public String year;
    public String make;
    public String model;
    public double price;
    public Customer owner;

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Customer getOwner(){
        return owner;
    }

    public void setOwner(Customer owner){
        this.owner = owner;
    }


}
