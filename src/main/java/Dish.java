public class Dish {

    private int orderId;
    private MenuItem menuItem;

    public Dish(int orderId, MenuItem menuItem) {
        this.orderId = orderId;
        this.menuItem = menuItem;
    }

    public int getOrderId() {
        return orderId;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }



}
