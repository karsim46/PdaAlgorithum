import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuitTest {
    Suit suit;
    ArrayList<String> deckSuit;


    @Before
    public void before(){
        suit = new Suit();
        deckSuit = new ArrayList<String>();
        deckSuit.add(0,"Hearts");
        deckSuit.add(1,"Clubs");
        deckSuit.add(2,"Spades");
        deckSuit.add(3,"Diamonds");
    }

    @Test
    public void suitFound(){
        boolean result = suit.suitSearch(deckSuit,"Diamonds");
        assertTrue(result);

    }
    @Test
    public void noSuitFound(){
        boolean result = suit.suitSearch(deckSuit,"Joker");
        assertFalse(result);

    }
}
