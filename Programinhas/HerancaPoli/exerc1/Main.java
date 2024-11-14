package HerancaPoli.exerc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

        System.out.print("Enter the number of products:");
        int n = scan.nextInt();

        List<Product> products = new ArrayList<>();

        String name = " ";
        double price = 0;
        char tag = ' ';

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            tag = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("Price: ");
            price = scan.nextDouble();
            if (tag == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                products.add(new UsedProduct(name, price, date));
            } else if (tag == 'i') {
                System.out.print("Customs fee: ");
                double fee = scan.nextDouble();
                price += fee;
                products.add(new ImportedProduct(name, price, fee));
            } else {
                products.add(new Product(name, price));
            }

        }

        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());

        }


    }
}
