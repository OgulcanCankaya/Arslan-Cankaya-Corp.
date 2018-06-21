public class Cards implements Card_Interface {
    private int value;
    private String symbol;


    public Cards(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public void setValue(int new_value) {
        this.value = new_value;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public void setSymbol(String new_symbol) {
        this.symbol = new_symbol;
    }


    @Override
    public String human_readable() {
        if(this.value == 11){
            String a = "J";
            return(symbol+" "+ a);
        }
        else if (this.value == 12){
            String a = "Q";
            return(symbol+" "+ a);
        }
        else if (this.value == 13){
            String a = "K";
            return(symbol+" "+ a);
        }
        else if (this.value == 14){
            String a = "A";
            return(symbol+" "+ a);
        }
        else{
            int a = value;
            return(symbol+" "+ a);
        }

    }
}
