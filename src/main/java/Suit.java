import java.util.ArrayList;

public class Suit {

    public Boolean suitSearch(ArrayList<String> array, String suit_search){
        for(String suit : array)
            if (suit.equals(suit_search)){
                return true;
            }
        return false;
    }
}
