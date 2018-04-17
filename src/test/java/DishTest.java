import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DishTest {

    Dish dish;

    @Before
    public void simon() {
        dish = new Dish(1,MenuItem.LASAGNE);
    }

    @Test
    public void hasOrderNumber() {
        assertEquals(1,dish.getOrderId());
    }

    @Test
    public void isLasagne() {
        assertEquals(MenuItem.LASAGNE,dish.getMenuItem());
    }
}
