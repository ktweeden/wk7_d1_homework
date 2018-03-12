import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    Shop shop;
    ExtremeRollercoaster extremeRollercoaster;
    MildRollercoaster mildRollercoaster;
    ThemePark themePark;

    @Before
    public void before() {
        shop = new Shop(10, "Shop");
        extremeRollercoaster = new ExtremeRollercoaster(20, "Extreme", 110);
        mildRollercoaster = new MildRollercoaster(10, "Mild");
        themePark = new ThemePark("THEME");
    }

    @Test
    public void hasName() {
        assertEquals("THEME", themePark.getName());
    }

    @Test
    public void canGetRollerCoasters() {
        assertEquals(0, themePark.getRollercoasters().size());
    }

    @Test
    public void canAddRollercoaster() {
        themePark.addRollercoaster(extremeRollercoaster);
        assertEquals(1, themePark.getRollercoasters().size());
    }


    @Test
    public void canAddShop() {
        themePark.addShop(shop);
        assertEquals(1, themePark.getShops().size());
    }

    @Test
    public void canGetShops() {
        assertEquals(0, themePark.getShops().size());
    }
}
