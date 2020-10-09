package solent.ac.uk.ood.examples.week10.model;

public class Lorry extends Vehicle {
    
    public Lorry(double weightIN,String regNoIN){
        super(weightIN,regNoIN);
    
    }

    @Override
    public double calculateFee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
