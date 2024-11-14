package poo.q2;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double NetSalary() {
        double salary = grossSalary - (tax);
        return salary;
    }

    public void IncreaseSalary(double porcentagem) {
        grossSalary = grossSalary + (grossSalary * (porcentagem/100));

    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "name: " + name + ',' +
                " NetSalary: " + NetSalary() +
                '.';
    }
}
