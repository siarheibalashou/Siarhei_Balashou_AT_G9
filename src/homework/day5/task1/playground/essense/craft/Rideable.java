package homework.day5.task1.playground.essense.craft;

public interface Rideable {
    default void drive(String direction){
        String driveInfo = "I am "+ this.getClass().getSimpleName()+", my name is "+this.getClass().getName()+" and I am driving to "+ direction;
        System.out.println(driveInfo);
    }
}
