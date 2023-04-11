import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void setUp() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void shouldStartAt100() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void shouldTake10FromVolumeEachTime() {
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void shouldEmptyVolume() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void shouldFillVolume() {
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }


}
