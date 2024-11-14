package aleatorio.composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> lista = new ArrayList<>();
    private Client cliente;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(Date moment, OrderStatus status, Client cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getLista() {
        return lista;
    }

    public void addItem(OrderItem item) {
        lista.add(item);
    }

    public void removeItem(OrderItem item) {
        lista.remove(item);
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public double total() {
        double total = 0;
        for (OrderItem item : lista) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Order items:\n");
        for (OrderItem item: lista) {
        sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
