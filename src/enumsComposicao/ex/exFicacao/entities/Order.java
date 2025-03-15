package enumsComposicao.ex.exFicacao.entities;

import enumsComposicao.ex.exFicacao.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order(){};

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem i : items){
            sum+=i.getPrice();
        }
        return sum;
    }

    public void OrderItems(){
        for (OrderItem i : items){
            System.out.println(i.toString());
        }
    }

}
