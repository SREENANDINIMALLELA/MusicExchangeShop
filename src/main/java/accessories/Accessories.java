package accessories;

import behaviours.ISell;
import shopItems.ShopItems;

public abstract class Accessories extends ShopItems  {
    private String type ;
    public Accessories(double boughtPrice, double sellingPrice,String  type ) {
        super(boughtPrice, sellingPrice);
        this.type=type;
    }
    public String getType() {
        return type;
    }
}
