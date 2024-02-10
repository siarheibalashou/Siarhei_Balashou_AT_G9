package homework.day1.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int numberMultiplied) {
        return numberMultiplied * 3;
    }

    public long returnNewLong(long numberLong) {
        return numberLong - 4;
    }

    public char returnNewChar(char charValue) {
        return (char) (charValue + charValue);
    }

    public float returnNewFloat(float floatNumber){
        return floatNumber/2;
    }
    public double returnNewDouble (double doubleNumber){
        return doubleNumber +8;
    }
    public int returnNewShort(short shortNumber){
        return shortNumber -1;
    }
    public int returnNewByte (byte byteNumber){
        return byteNumber*2;
    }
    public boolean returnNewBoolean (boolean booleanValue){
        return !booleanValue;
    }

}
