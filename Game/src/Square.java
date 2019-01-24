
public class Square {

    String value;


    Square(){
        value = "_";
    }

    public String getValue() {
        return value;
    }

    public void hit(){
        value = "X";
    }

    public void miss(){
        value = "O";
    }



}
