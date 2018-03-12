import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer(100, 120);
    }

    @Test
    public void hasWallet() {
        assertEquals(100, customer.getWallet());
    }

    @Test
    public void hasHeight(){
        assertEquals(120, customer.getHeight());
    }

    @Test
    public void canPay() {
        assertTrue(customer.pay(10));
    }
}
