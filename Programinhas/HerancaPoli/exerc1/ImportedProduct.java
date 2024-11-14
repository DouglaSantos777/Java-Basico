package HerancaPoli.exerc1;

public class ImportedProduct extends Product {
    private double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ "
                + String.format("%.2f", getPrice())
                + " (Custom fee: $ "
                + String.format("%.2f", customFee)
                +  ")";
    }

    public double totalPrice() {
    return getPrice() + customFee;
    }

}
