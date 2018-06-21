import java.util.ArrayList;

public interface Player_Interface {

    public void printHand();
    public ArrayList<Cards> getHand();
    public void setMoney(int new_money);
    public int getMoney();
    public void resetHand();
    public void get_a_Card(Cards newCards);

}
