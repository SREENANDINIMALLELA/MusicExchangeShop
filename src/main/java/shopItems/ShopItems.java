package shopItems;

import behaviours.ISell;

public abstract class ShopItems implements ISell {
       private  double boughtPrice;
       private  double sellingPrice ;
    public ShopItems(double boughtPrice, double sellingPrice) {
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        double profit=sellingPrice - boughtPrice;
        double markup =( profit / boughtPrice)*100;
        return markup;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
