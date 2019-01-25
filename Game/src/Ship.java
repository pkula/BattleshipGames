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
                squares.remove(i);
                return true;
            }else{
                s.miss();
            }
        }
        return false;
    }

    public String getMessageAndHit(Square s){
        if (checkIfHit(s)){
            if (squares.size() == 0){
                System.out.println("Hit and sink");
                return "Hit and sink";
            }
            System.out.println("Hit");
            return "Hit";
        }else{
            System.out.println("Miss");
            return "Miss";
        }
    }

}


