import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MildRollercoasterTest {

    MildRollercoaster rollercoaster;
    Customer customer;
    @Before
    public void before() {
        rollercoaster = new MildRollercoaster(10, "The Gentle One");
        customer = new Customer(100, 120);
    }


    @Test
    public void canGetTakings() {
        assertEquals(0, rollercoaster.getTakings());
    }

    @Test
    public void canTakePayment() {
        rollercoaster.takePayment(customer);
        assertEquals(10, rollercoaster.getTakings());
    }

    @Test
    public void hasName() {
        assertEquals("The Gentle One", rollercoaster.getName());
    }
    @Test
    public void hasCost() {
        assertEquals(10, rollercoaster.getCost());
    }
}
