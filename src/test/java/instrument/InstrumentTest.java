package instrument;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    private Instrument instrument;
    @Before
    public void setup() {
        instrument= new Piano(40,50,"Wooden","Black", InstrumentType.KEYBOARD);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(50.00,instrument.getSellingPrice(),0.1);
    }
    @Test
    public void hasBoughtPrice() {
        assertEquals(40.00,instrument.getBoughtPrice(),0.1);
    }
    @Test
    public void calculateMarkUp() {
        assertEquals(25,instrument.calculateMarkup(),0.1);
    }
    @Test

    public void getInstrumentType() {
        assertEquals("KEYBOARD", instrument.getInstrumentType());
    }

}
