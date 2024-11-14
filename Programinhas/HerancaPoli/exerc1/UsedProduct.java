package HerancaPoli.exerc1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ "
                + String.format("%.2f", getPrice())
       + " (Manufacture date: " + sdf.format(manufactureDate)+ ")";
    }

}
