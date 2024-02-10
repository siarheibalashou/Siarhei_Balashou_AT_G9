package homework.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        ZeroToTwenty objectZero = new ZeroToTwenty();
        ArrayRandomFill objectArrayRandomFill = new ArrayRandomFill();
        PrintArrayElements objectPrintArrayElems = new PrintArrayElements();
        ArrayElementMultiplication arrayElementMultiplication = new ArrayElementMultiplication();
        ArrayElementsSquaring arrayElementsSquaring = new ArrayElementsSquaring();
        forOdd objectForOdd = new forOdd();
        MinimumArrayElement minimumArrayElement = new MinimumArrayElement();
        objectZero.oneToTwenty();
        objectForOdd.oddRangeNumber();
        objectArrayRandomFill.arrayRandomFill();
        objectPrintArrayElems.displayArray();
        arrayElementMultiplication.arrayMultiplication();
        arrayElementsSquaring.arraySquaring();
        minimumArrayElement.minimumArrayElem();
        ReverseDisplayArray reverseDisplayArray = new ReverseDisplayArray();
        reverseDisplayArray.reverseArray();
        FirstElementToLast firstElementToLast = new FirstElementToLast();
        firstElementToLast.firstToLast();
        ArraySorting arraySorting=new ArraySorting();
        arraySorting.arraySorting();
    }
}



