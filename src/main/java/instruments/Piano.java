package instruments;

public class Piano extends Instrument {

    public Piano(double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type) {
        super(boughtPrice, sellingPrice, material, colour, type);
    }

    public String play() {
        return "piano ting ting";
    }
}
