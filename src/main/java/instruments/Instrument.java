package instruments;


import behaviours.IPlay;
import shopItems.ShopItems;

public abstract class Instrument extends ShopItems implements IPlay {
    private String material ;
    private String colour;
    private InstrumentType instrumentType ;


    public Instrument(double boughtPrice, double sellingPrice, String material, String colour,InstrumentType type  ) {
        super(boughtPrice, sellingPrice);
        this.material = material;
        this.colour=colour;
        this.instrumentType = type ;
    }

    public String getMaterial() {
        return material;
    }

    public String getInstrumentType() {
        return instrumentType.toString();
    }
    public String Play(){
        return "playing";
    }
}
