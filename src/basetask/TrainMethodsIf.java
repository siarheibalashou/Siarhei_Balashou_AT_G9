package basetask;

public class TrainMethodsIf {
    public double returnNewInt(int integerNumber) {
        if (integerNumber < 8) {
            return integerNumber * 7;
        } else return (double) integerNumber / 4;
    }

    public long returnNewLong(long longNumber) {
        if (longNumber > 300) {
            return (longNumber - 300);
        } else return (longNumber + 20);
    }

    public String returnNewChar(char charValue) {
        if (charValue == 'g') {
            return ("go");
        } else return ("o" + charValue);
    }

    public float returnNewFloat(float floatNumber) {
        if (floatNumber == 0.67) {
            return floatNumber;
        } else return floatNumber * 2;

    }

    public double returnNewDouble(double doubleNumber) {
        if (doubleNumber > 30 && doubleNumber < 80) {
            return (doubleNumber + 87);
        } else if (doubleNumber > 80 && doubleNumber < 400) {
            return (doubleNumber - 87);
        } else if (doubleNumber > 400){
            return doubleNumber/4;
        } else return doubleNumber;
    }
    public void returnNewBoolean (boolean booleanValue){
        if (booleanValue ==true){
            System.out.print("Я получил на вход значение истины");
        }else System.out.print("Я получил на вход ложь");
    }
}

