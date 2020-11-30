package com.sarish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImparativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        //Remove the duplicates from the list.

        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<Integer>();
        for (int i : integerList){
            if (!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println("Imparative Approach Unique List: "+ uniqueList);

        /**
         * Declarative Syle
         */
        List<Integer> uniqueList1 = integerList.stream()
                                                .distinct()
                                                .collect(Collectors.toList());
        System.out.println("Declarative Approach uniqueList: " + uniqueList1);
    }
}
