import java.util.ArrayList;

public class Player implements  Player_Interface{
    private ArrayList<Cards> hand = new ArrayList<>();
    private int dollares = 0;
    private int point = 0;
    private double win_rate;

    @Override
    public void get_a_Card(Cards newCards) {

    }

    @Override
    public void printHand() {
        System.out.println(hand.get(0).human_readable() + hand.get(1).human_readable());
    }

    @Override
    public void resetHand() {
        hand.set(0,null);
        hand.set(0,null);
    }


    @Override
    public ArrayList<Cards> getHand() {
        return hand;
    }

    @Override
    public void setMoney(int new_money) {
        this.dollares =  new_money;
    }

    @Override
    public int getMoney() {
        return this.dollares;
    }
}
