package org.vistula.basket;

public class PromoItem extends BasketItem {
    public float discount;

    public PromoItem(float price, boolean ageRestrictedItem, float discount) {
        super(price, ageRestrictedItem);
        this.discount = discount;

        super.setPrice(super.getPrice() * this.discount / 100);}}
