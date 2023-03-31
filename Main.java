package OOP_HW4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DynamicList<Integer> numList = new DynamicList<>();
        numList.add(5);
        numList.add(4);
        numList.add(3);
        numList.add(2);
        numList.add(1);

        numList.print();
        numList.removeByIndex(1);
        numList.print();
        numList.removeByValue(5);
        numList.print();
        System.out.println(numList.getMin());
        System.out.println(numList.getMax());
        numList.getSum();
        numList.getProduct();



        DynamicList<String> strList = new DynamicList<>();
        strList.add("Do");
        strList.add("not");
        strList.add("worry");
        strList.add(",");
        strList.add("be");
        strList.add("happy");
        strList.add("!");

        strList.print();
        strList.removeByIndex(1);
        strList.print();
        strList.removeByValue("!");
        strList.print();
        strList.add("???");
        strList.print();
        System.out.println(strList.getMin());
        System.out.println(strList.getMax());
        strList.getSum();
        strList.getProduct();
    
    }
}
