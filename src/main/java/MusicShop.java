import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class MusicShop {
    private ArrayList sellingStock;
    public MusicShop(){
    this.sellingStock= new ArrayList();
    }
    public void addStock(ISell stock){
        sellingStock.add(stock);
    }

    public int getSellingStock() {
        return sellingStock .size();
    }

    public void removeStock(Instrument instrument) {
        sellingStock.remove(instrument);
    }
}
