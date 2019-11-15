package shop;

public abstract class ShopItems implements ISell {
       private  double boughtPrice;
       private  double sellingPrice ;
    public ShopItems(double boughtPrice, double sellingPrice) {
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        double profit= boughtPrice-sellingPrice;
        double markup =( profit /boughtPrice)*100;
        return markup;
    }
}
