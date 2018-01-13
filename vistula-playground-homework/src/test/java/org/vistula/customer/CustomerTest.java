package org.vistula.customer;

import org.assertj.core.api.AbstractBooleanAssert;
import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void ageRestrictedItemTest1() {
        Customer Agnieszka = new Customer();
        Agnieszka.setAge(19);

        assertThat(Agnieszka.ageRestrictedItem()).isTrue();
    }

    @Test
    public void ageRestrictedItemTest2() {
        Customer Agnieszka = new Customer();
        Agnieszka.setAge(11);

        assertThat(Agnieszka.ageRestrictedItem()).isFalse();
    }

    @Test
    public void shouldAddToBasketTest1() {
        Customer Agnieszka = new Customer("Agnieszka", "Chmielewska", 15);
        BasketItem jacket = new BasketItem(5.0f, false);
        BasketItem skirt = new BasketItem(5.0f, true);
        Agnieszka.addItem(jacket);
        Agnieszka.addItem(skirt);

        assertThat( Agnieszka.getBasket().contains(jacket)).isTrue();
        assertThat( Agnieszka.getBasket().contains(skirt)).isFalse();
    }


    @Test
    public void shouldAddToBasketTest2() {
        Customer Agnieszka = new Customer("Agnieszka", "Chmielewska", 25);
        BasketItem jacket = new BasketItem(5.0f, false);
        BasketItem skirt = new BasketItem(5.0f, true);
        Agnieszka.addItem(jacket);
        Agnieszka.addItem(skirt);

        assertThat( Agnieszka.getBasket().contains(jacket)).isTrue();
        assertThat( Agnieszka.getBasket().contains(skirt)).isTrue();
    }

    @Test
    public void shouldRemoveFromBasketTest() {
        Customer Agnieszka = new Customer("Agnieszka", "Chmielewska", 11);
        BasketItem skirt = new BasketItem(5.0f, false);
        BasketItem jacket = new BasketItem(5.0f, false);
        BasketItem socks = new BasketItem(2.0f, false);
        BasketItem shirt = new BasketItem(6.0f,true);
        Agnieszka.addItem(skirt);
        Agnieszka.addItem(jacket);
        Agnieszka.addItem(socks);
        Agnieszka.addItem(shirt);

        assertThat( Agnieszka.getBasket().size() == 3);
        Agnieszka.removeItem(jacket);
        Agnieszka.removeItem(socks);

        assertThat( Agnieszka.getBasket().size() == 1);
}


}

