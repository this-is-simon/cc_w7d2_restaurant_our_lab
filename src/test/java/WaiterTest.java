import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    private Waiter waiter1;
    private Customer customer1;
    private Kitchen kitchen1;

    @Before
    public void before() {
        waiter1 = new Waiter("Todd", 100.00);
        customer1 = new Customer("Bob",100.00);
        kitchen1 = new Kitchen();
    }

    @Test
    public void hasName() {
        assertEquals("Todd", waiter1.getName());
    }

    @Test
    public void hasBumBagCash() {
        assertEquals(100d, waiter1.getBumBagCash(), 0.01);
    }

    @Test
    public void hasNotepad(){
        assertEquals(0,waiter1.getNotepadSize());
    }

    @Test
    public void canTakeOrder(){
        waiter1.takeOrder(customer1);
        assertEquals(1,waiter1.getNotepadSize());
    }

    @Test
    public void canSendOrderToKitchen(){
        waiter1.takeOrder(customer1);
        waiter1.passToKitchen(kitchen1);
        assertEquals(0,waiter1.getNotepadSize());
        assertEquals(1,kitchen1.getListofOrders().size());
    }



}