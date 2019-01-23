
public class Square {

    String value;


    Square(){
        value = "_";
    }
/*
    Square(String coordinates){
        this.y = Integer.valueOf(coordinates.substring(1)).intValue();
        switch(coordinates.substring(0,1)){
            case "A":
                this.x = 0;
                break;
            case "B":
                this.x = 1;
                break;
            case "C":
                this.x = 2;
                break;
            case "D":
                this.x = 3;
                break;
            case "E":
                this.x = 4;
                break;
            case "F":
                this.x = 5;
                break;
            case "G":
                this.x = 6;
                break;
            case "H":
                this.x = 7;
                break;
            case "I":
                this.x = 8;
                break;
            case "J":
                this.x = 9;
                break;
        }
        value = "_";
    }
    */

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
