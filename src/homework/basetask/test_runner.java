package homework.basetask;

public class test_runner {
    public static void main(String[] args) {
        Bee objectBee1 = new Bee("m", 13);
        objectBee1.printBeeDetails();
        Obstacle objectObstacle = new Obstacle("тест", "блок");
        objectObstacle.printObstacleDetails();
        Pineapple objectPineapple = new Pineapple("grade", 120000);
        objectPineapple.printPineappleDetails();
    }
}
