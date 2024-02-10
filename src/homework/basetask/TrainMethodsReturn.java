package homework.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int numberMultiplied) {
        return numberMultiplied * 3;
    }

    public long returnNewLong(long numberLong) {
        return numberLong - 4;
    }

    public String returnNewChar(char charValue) {
        return String.valueOf(charValue) + String.valueOf(charValue);
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
