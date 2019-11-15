package Accessories;

import accessories.Accessories;
import accessories.DrumSticks;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shopItems.ShopItems;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {
    private Accessories accessory;
    @Before
    public void setup() {
        accessory = new DrumSticks(20,25,"wooden");
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(25.00,accessory.getSellingPrice(),0.1);
    }
    @Test
    public void hasBoughtPrice() {
        assertEquals(20.00,accessory.getBoughtPrice(),0.1);
    }
    @Test
    public void calculateMarkUp() {
        assertEquals(25,accessory.calculateMarkup(),0.1);
    }
    @Test
    public void hasType() {
        assertEquals("wooden",accessory.getType());
    }



}
