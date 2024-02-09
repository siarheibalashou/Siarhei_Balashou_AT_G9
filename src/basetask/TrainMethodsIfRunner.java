package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf objectTrainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + objectTrainMethodsIf.returnNewInt(12));
        System.out.println("метод returnNewLong вернул " + objectTrainMethodsIf.returnNewLong(12123123L));
        System.out.println("метод returnNewChar вернул " + objectTrainMethodsIf.returnNewChar('f'));
        System.out.println("метод returnNewFloat вернул " + objectTrainMethodsIf.returnNewFloat(0.67F));
        System.out.println("метод returnNewDouble вернул " + objectTrainMethodsIf.returnNewDouble(400));
        objectTrainMethodsIf.returnNewBoolean(false);
    }
}
