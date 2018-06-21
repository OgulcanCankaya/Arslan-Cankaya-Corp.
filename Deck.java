import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck implements Deck_Interface{
    private ArrayList<Cards> deck = new ArrayList<>();
    private String[] symbols = {"Diamonds","Spades","Hearts","Clubs"};
    private Random r = new Random();

    public Deck() {
        initDeck();
        shuffle();
    }


    @Override
    public void initDeck() {
        for(int symbol=0; symbol<4; symbol++){
            for(int value=2; value<15;value++){
                Cards cards = new Cards(value,symbols[symbol]);
                deck.add(cards);
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);

    }


    @Override
    public void printDeck() {
        for (int i = 0; i <= deck.size()-1; i++) {
            System.out.println(i+1 + "- " + deck.get(i).human_readable());
        }
    }

    @Override
    public Cards drawTopCard() {
        Cards temp = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return temp;

    }
    public void sort_try(){
        Collections.sort(deck);

    }
}
