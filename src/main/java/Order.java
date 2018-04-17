import java.util.Random;

public class Order {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;

    public Order(int orderId, int quantity, MenuItem menuItem){
        this.orderId = orderId;
        this.quantity = quantity;
        this.menuItem = menuItem;

    }

    public Order(int quantity, MenuItem menuItem){
        Random rand = new Random();
        int randomId = rand.nextInt(99) + 1;
        this.orderId = randomId;
        this.quantity = quantity;
        this.menuItem = menuItem;

    }

    public int getOrderId(){
        return this.orderId;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public MenuItem getMenuItem(){
        return this.menuItem;
    }



}
