import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KitchenTest {

    Kitchen kitchen;
    Order order1;

    @Before
    public void bananas() {
        order1 = new Order(1,3,MenuItem.LASAGNE);
        kitchen = new Kitchen();
    }


    @Test
    public void canCookOrder() {
       Dish dish = kitchen.cookOrder(order1);
        assertEquals(MenuItem.LASAGNE, dish.getMenuItem());
    }
}
