import java.util.ArrayList;

public class Waiter {

    private String name;
    private double bumBagCash;
    private ArrayList<Order> notepad;

    public Waiter(String name, double bumBagCash){
        this.name = name;
        this.bumBagCash = bumBagCash;
        this.notepad = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBumBagCash() {
       return bumBagCash;
    }

    public int getNotepadSize(){
        return notepad.size();
    }

    public void takeOrder(Customer customer){
        notepad.add(customer.placeOrder());
    }

    public void passToKitchen(Kitchen kitchen){
        kitchen.acceptOrders(notepad);
        notepad.clear();
    }

}
