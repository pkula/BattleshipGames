import java.util.*;
public class Ship {

    List<Square> squares;

    Ship(ArrayList squares){
        this.squares = squares;
    }

    public boolean checkIfHit(Square s){
        for (int i=0;i<squares.size();i++){
            if (squares.get(i) == s){
                s.hit();
                return true;
            }else{
                s.miss();
            }
        }
        return false;
    }


}


