package classesabstratas;

public class Company extends TaxPayer {
    private int emp;

    public Company(String name, double anualIncome, int emp) {
        super(name, anualIncome);
        this.emp = emp;
    }

    @Override
    public double calculateTax() {
        if (emp <= 10) {
            return (getAnualIncome() * 0.16);
        } else {
            return  (getAnualIncome() * 0.14);
        }
    }

}
