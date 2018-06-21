import java.util.ArrayList;

public class Winning {
    ArrayList<Cards> total_table = new ArrayList<>();


    public boolean straight_flush(ArrayList<Cards> table, Player player){
        /** table bir arraylist ve player bazında puan hesaplayacağız eğer straight flush varsa**/
        total_table.addAll(table);
        total_table.addAll(player.getHand());
        



        return true;
    }



    public int return_point(ArrayList<Cards> table, Player player){
        if (straight_flush(table, player)){
            return 800 /*  +  hand */;
        }else {
            return 0;
        }
    }
}
