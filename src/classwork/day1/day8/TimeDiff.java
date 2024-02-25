package classwork.day1.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeDiff {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("мама" + i);
        }
        long myList1Time = System.currentTimeMillis() - t0;
        System.out.println(myList1Time);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("мама" + i);
        }
        long myList2Time =  System.currentTimeMillis() - t1;
        System.out.println(myList2Time);
        if (myList2Time > myList1Time) {
            System.out.println("ArrayList list is faster");
        } else System.out.println("LinkedList is faster");
    }
}
