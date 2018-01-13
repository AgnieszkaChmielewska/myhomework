package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;

    public Customer() {

    }

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        basket = new ArrayList<BasketItem>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }

    public boolean ageRestrictedItem() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }



    public void totalBasketValue(){
        float totalValue = 0;
        for (int i=0; basket.size() -1 >= i; i++){
           totalValue= totalValue + basket.get(i).getPrice();
    }
}
    public void addItem(BasketItem basketItem) {
        if (basketItem.isAgeRestrictedItem()) {
            if (ageRestrictedItem()) {
                basket.add(basketItem);
                System.out.println("Produkt został dodany do koszyka.");
            } else {
                System.out.println("Nie możesz kupic tego produktu.");
            }
        } else {
            basket.add(basketItem);
            System.out.println("Produkt został dodany do koszyka.");

        }

    }

    public void productsInBasket() {
        for (int i = 0; basket.size() - 1 >= i; i++) {
            System.out.println("W koszyku znajdują się produkty: " + (i + 1));

        }

    }
        public void removeItem (BasketItem basketItem){
        basket.remove(basketItem);
            System.out.println("Produkt został usunięty z koszyka.");
        }
}


