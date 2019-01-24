public class Main {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.hit(1,0);
        ocean.hit(1,7);
        ocean.hit(8,4);
        ocean.miss(6,0);
        ocean.hit("A0");
        ocean.hit("J0");
        ocean.hit("J1");
        ocean.hit("J2");
        ocean.hit("J3");
        ocean.hit("J4");
        ocean.hit("J5");
        ocean.hit("J6");
        ocean.hit("J7");
        ocean.hit("J8");
        ocean.displayOcean();
    }
}
