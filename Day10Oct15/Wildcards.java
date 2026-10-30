package Day10Oct15;

import java.util.*;
public class Wildcards {
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args){
        List<String> names = Arrays.asList("Ved","Soniya");
        List<Integer> nums = Arrays.asList(20,30);
        List<Double> prices = Arrays.asList(55.2,22.3);

        System.out.println("name: ");
        printList(names);

        System.out.println("\nNumbers: ");
        printList(nums);

        System.out.println("\nPrices: ");
        printList(prices);
    }
}
