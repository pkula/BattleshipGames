public class Ocean {

    Square[][] squares;
    Ship[] ships;
    // coordinates 0,0 is on the left top corner
    // column are letters (x)
    // rows are numbers (y)
    // squares[y][x]

    Ocean(){
        squares = new Square[10][10];
        for (int i=0; i<10;i++){
            for (int a=0; a<10;a++){
                squares[a][i] = new Square();
            }
        }

    }


    void displayOcean() {
        System.out.println("    A B C D E F G H I J ");
        System.out.println("    _ _ _ _ _ _ _ _ _ _ ");
        for (int i=0; i<10;i++){
            System.out.println( i +"  " +"|"+squares[i][0].getValue()+"|"+squares[i][1].getValue()+
                    "|"+squares[i][2].getValue()+"|"+squares[i][3].getValue()+"|"+squares[i][4].getValue()+
                    "|"+squares[i][5].getValue()+"|"+squares[i][6].getValue()+"|"+squares[i][7].getValue()+"|"+
                    squares[i][8].getValue()+"|"+squares[i][9].getValue()+"|");
        }
    }

    Square chooseField(int x, int y){
        return squares[y][x];
    }

    Square chooseField(String coordinates){
        int x,y;
        y = Integer.valueOf(coordinates.substring(1)).intValue();
        switch(coordinates.substring(0,1)){
            case "A":
                x = 0;
                break;
            case "B":
                x = 1;
                break;
            case "C":
                x = 2;
                break;
            case "D":
                x = 3;
                break;
            case "E":
                x = 4;
                break;
            case "F":
                x = 5;
                break;
            case "G":
                x = 6;
                break;
            case "H":
                x = 7;
                break;
            case "I":
                x = 8;
                break;
            case "J":
                x = 9;
                break;
            default:
                x = 0; // to pozniej do poprawy w zaleznosci od kodu pozniej
        }
        return squares[y][x];
    }

    void miss(int x, int y){
        chooseField(x,y).miss();
    }

    void miss(String coordinates){
        chooseField(coordinates).miss();
    }

    void hit(int x, int y){
        chooseField(x,y).hit();
    }

    void hit(String coordinates){
        chooseField(coordinates).hit();
    }

    getSquare(int x, int y){
        return squares[y][x];
    }



}
