import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Cards> table = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private int playerNumber;
    private Deck gameDeck = new Deck();

    public Game(int playerNumber){
        this.playerNumber = playerNumber;
        for(int i=0; i<playerNumber ; i++){
            Player player = new Player();
            players.add(player);
        }

    }

    public void setPlayerNumber() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of Players");
        int PlayerNumber = a.nextInt();
    }




    public void openTable1() {
        for(int i = 0; i<3;i++){
            table.add(gameDeck.drawTopCard());
        }

    }

    public void openTable2(){
        table.add(gameDeck.drawTopCard());
    }

    public void openTable3(){
        table.add(gameDeck.drawTopCard());
    }

    public void printTable(){
        for(int i=table.size(); i>i; i--){
            System.out.println(table.get(i).human_readable());
        }

    }

    public void dealHands(){
        for(int i=0; i<2; i++){
            for(int temp = playerNumber; temp>0; temp--){
                players.get(playerNumber).get_a_Card(gameDeck.drawTopCard());

            }
        }
    }

    public ArrayList<Cards> getTable() {
        return table;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
