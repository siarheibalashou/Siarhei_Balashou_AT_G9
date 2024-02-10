package homework.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects objectTrain = new TrainMethodsObjects();
        Mouse mouseOne = new Mouse("Zaza", 12);
        objectTrain.processMouse(mouseOne);
        objectTrain.processSouce(new Souce("garlic", "yellow"));
        objectTrain.processBee(new Bee("M", 144));
        Obstacle obstacle = new Obstacle("test description", "alarm");
        objectTrain.processObstacle(obstacle);
        objectTrain.processPineapple(new Pineapple("S",299999));
    }
}
