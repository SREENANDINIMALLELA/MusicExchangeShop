package musicShop;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MusicShopTest {
    private Instrument instrument;
    private MusicShop shop;
    @Before
    public void setup() {
        instrument= new Piano(40,50,"Wooden","Black", InstrumentType.KEYBOARD);
        shop = new MusicShop();
    }
    @Test
    public void hasStartsWithEmptyStock(){
        assertEquals(0,shop.getSellingStock() );
    }
    @Test
    public void addStock(){
        shop.addStock(instrument);
        assertEquals(1,shop.getSellingStock() );
    }
    @Test
    public void removeStock(){
        shop.addStock(instrument);
        shop.removeStock(instrument);
        assertEquals(0,shop.getSellingStock());
    }

}
