package homework.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouseZaza) {
        System.out.println(mouseZaza.getAge() + " " + mouseZaza.getName());
        mouseZaza.printMouseDetails();
    }
    public Souce processSouce (Souce souceOne){
        System.out.println(souceOne.getName() + " " + souceOne.getColor());
        souceOne.printSouceDetails();
        return souceOne;
    }
    public Bee processBee (Bee bee){
        System.out.println(bee.getGender() + " " + bee.getWeight());
        bee.printBeeDetails();
        return bee;
    }
    public  void processObstacle(Obstacle obstacle){
        System.out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }
    public String processPineapple (Pineapple pineapple){
        String x = "test return";
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
        return x;
    }
}


