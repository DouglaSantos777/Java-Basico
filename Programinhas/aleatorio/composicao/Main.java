package aleatorio.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name:");
        String name = scan.nextLine();
        System.out.print("Email:");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            scan.nextLine();
            String nameProduct = scan.nextLine();
            System.out.print("Product price: ");
            double price = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

           Product product = new Product(nameProduct, price);
           OrderItem orderItem = new OrderItem(quantity, product);

           order.addItem(orderItem);

           System.out.print("");
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        scan.close();

    }
}
