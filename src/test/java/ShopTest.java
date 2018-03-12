import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Customer customer;

    @Before
    public void before() {
        this.customer = new Customer(100, 110);
        this.shop = new Shop(10, "The Hamburger Shop");
    }

    @Test
    public void hasName(){
        assertEquals("The Hamburger Shop", shop.getName());
    }

    @Test
    public void hasTakings() {
        assertEquals(0, shop.getTakings());
    }

    @Test
    public void hasCost() {
        assertEquals(10, shop.getCost());
    }

    @Test
    public void canTakePayment() {
        shop.takePayment(customer);
        assertEquals(10, shop.getTakings());
    }

    @Test
    public void canIncrementTakings(){
        shop.incrementTakings(10);
        assertEquals(10, shop.getTakings());
    }

}
