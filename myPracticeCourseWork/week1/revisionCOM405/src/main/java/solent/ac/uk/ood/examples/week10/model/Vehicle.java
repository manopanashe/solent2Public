package solent.ac.uk.ood.examples.week10.model;

public abstract class Vehicle {
 
    private double weight;
    private String registration;
    public abstract double calculateFee();
    
    public Vehicle(double weightIN,String regNoIN){
   weight = weightIN;
   registration = regNoIN;
 }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
    
    
}

