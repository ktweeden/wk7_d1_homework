import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExtremeRollercoasterTest {
    ExtremeRollercoaster rollercoaster;
    Customer customer;
    @Before
    public void before() {
        rollercoaster = new ExtremeRollercoaster(10, "Crazy coaster", 110);
        customer = new Customer(100, 120);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(110, rollercoaster.getMinHeight());
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
        assertEquals("Crazy coaster", rollercoaster.getName());
    }
    @Test
    public void hasCost() {
        assertEquals(10, rollercoaster.getCost());
    }

    @Test
    public void canCheckHeight() {
        assertTrue(rollercoaster.checkHeight(customer));
    }
}
