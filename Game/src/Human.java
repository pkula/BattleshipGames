import java.util.Scanner;

public class Human extends Player{



    public void chooseFieldToAttack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose field to attack");
        String coordinates = scanner.nextLine();
        if (enemyOcean.ifRightField(coordinates)){
            enemyOcean.chooseField()
        }
    }
}
