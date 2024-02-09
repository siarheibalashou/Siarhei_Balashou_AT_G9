package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn objectMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + (objectMethodsReturn.returnNewInt(12)));
        System.out.println("метод returnNewLong вернул " + (objectMethodsReturn.returnNewLong(12123123123123123L)));
        System.out.println("метод returnNewChar вернул " + (objectMethodsReturn.returnNewChar('b')));
        System.out.println("метод returnNewFloat вернул " + (objectMethodsReturn.returnNewFloat(1231231.123123f)));
        System.out.println("метод returnNewDouble вернул " + (objectMethodsReturn.returnNewDouble(1231231.123122222232222222222d)));
        System.out.println("метод returnNewShort вернул " + (objectMethodsReturn.returnNewShort((short) 52)));
        System.out.println("метод returnNewByte вернул " + (objectMethodsReturn.returnNewByte((byte) 11)));
        System.out.println("метод returnNewBoolean вернул " + (objectMethodsReturn.returnNewBoolean(false)));
    }
}
