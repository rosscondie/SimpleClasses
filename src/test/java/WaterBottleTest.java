import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void setUp() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void shouldStartAt100() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void shouldTake10FromVolume() {
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void shouldTake20FromVolume() {
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }
}
