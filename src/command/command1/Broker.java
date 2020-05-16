package command.command1;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        orders.forEach(e->e.execute());
        orders.clear();
    }

    public List<Order> getList(){
        return new ArrayList<>(orders);
    }


}
