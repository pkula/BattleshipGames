
public class Square {

    int[] coordinates; //first y - wiersz then x - kolumn
    String value;


    Square(int[] coordinates){
        this.coordinates = coordinates;
        value = "_";
    }


    Square(String coordinates){
        this.coordinates = new int[2];
        this.coordinates[0] = Integer.valueOf(coordinates.substring(1)).intValue();
        switch(coordinates.substring(0,1)){
            case "A":
                this.coordinates[0] = 0;
                break;
            case "B":
                this.coordinates[0] = 1;
                break;
            case "C":
                this.coordinates[0] = 2;
                break;
            case "D":
                this.coordinates[0] = 3;
                break;
            case "E":
                this.coordinates[0] = 4;
                break;
            case "F":
                this.coordinates[0] = 5;
                break;
            case "G":
                this.coordinates[0] = 6;
                break;
            case "H":
                this.coordinates[0] = 7;
                break;
            case "I":
                this.coordinates[0] = 8;
                break;
            case "J":
                this.coordinates[0] = 9;
                break;
        }
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
