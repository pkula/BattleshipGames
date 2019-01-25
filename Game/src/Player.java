import java.util.Scanner;

public class Player {
    protected String name;
    protected Ocean myOcean;
    protected Ocean enemyOcean;

    Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's  Your name");
        name = scanner.nextLine();
        myOcean = new Ocean();
        enemyOcean = new Ocean();
    }



}
