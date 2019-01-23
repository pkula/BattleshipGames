public class Ocean {

    Square[][] squares;
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
}
