import java.util.ArrayList;

public class Kitchen {

    public ArrayList<Order> listofOrders;

    public Kitchen() {
        this.listofOrders = new ArrayList<>();
    }

    public Dish cookOrder(Order order){
    Dish cookedDish = new Dish(order.getOrderId(), order.getMenuItem());
    return cookedDish;
}

    public void acceptOrders(ArrayList<Order> orders){
        listofOrders.addAll(orders);
    }

    public ArrayList<Order> getListofOrders() {
        return listofOrders;
    }
}
