package instrument;

import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shopItems.ShopItems;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    private ShopItems shopitems;
    @Before
    public void setup() {
     shopitems = new Piano(40,50,"Wooden","Black", InstrumentType.KEYBOARD);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(50.00,shopitems.getSellingPrice(),0.1);
    }
    @Test
    public void hasBoughtPrice() {
        assertEquals(40.00,shopitems.getBoughtPrice(),0.1);
    }
    @Test
    public void calculateMarkUp() {
        assertEquals(25,shopitems.calculateMarkup(),0.1);
    }

}
