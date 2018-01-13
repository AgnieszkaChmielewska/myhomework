package org.vistula.basket;

import org.junit.Test;

public class BasketItemTest {

    @Test
    public void PromotionTest() {
        PromoItem item = new PromoItem(50.0f, true, 10);
        assert item.getPrice()==5.0f;
    }
}

