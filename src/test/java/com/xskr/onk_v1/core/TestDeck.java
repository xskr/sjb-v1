package com.xskr.onk_v1.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestDeck {
    @Test
    public void testDeal(){
        int cardCount = 10;
        List<Card> cards = CardUtil.getCards(cardCount);
        Deck deck = new Deck(cards.toArray(new Card[0]));
        deck.shuffle(cardCount * 3);
        for(int i=0; i<cardCount; i++) {
            Card card = deck.deal();
            System.out.println(card);
        }
        Assert.assertEquals(0, deck.getCards().length);
    }
}
