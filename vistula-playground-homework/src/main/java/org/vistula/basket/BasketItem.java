package org.vistula.basket;
import java.util.ArrayList;
import java.util.List;

public class BasketItem {

    public float price;
    boolean ageRestrictedItem;

    public BasketItem (){

    }

    public BasketItem(float price, boolean ageRestrictedItem) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public float getPrice() {
        return price;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }



    }

