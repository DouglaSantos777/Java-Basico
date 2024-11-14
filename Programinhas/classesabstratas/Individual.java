package classesabstratas;

public class Individual extends TaxPayer {
    private double healthCare;

    public Individual(String name, double anualIncome, double healthCare) {
        super(name, anualIncome);
        this.healthCare = healthCare;
    }

    @Override
    public double calculateTax(){
    if(getAnualIncome() < 20000){
       return ((getAnualIncome() *0.15) - (healthCare * 0.5));
    } else {
        return ((getAnualIncome() *0.25) - (healthCare * 0.5));
    }
    }

}
