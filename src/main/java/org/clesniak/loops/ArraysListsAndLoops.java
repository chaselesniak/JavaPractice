package java.org.clesniak.loops;

import java.util.List;

public class ArraysListsAndLoops {
    public void ArraysForLoopRefresher() {
        //Basic For-Loop Construction
        //Array initialized with all 0's
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int randomVariable = -1;
            arr[i] = i;
        }
        //randomVariable only accessible inside for loop
        // arr = [0,1,2,3,4,5,6,7,8,9]
        }

    public void ForEachLoopRefresher(){
        //For-each loop construction
        //List<Integer> nameList = Arrays.asList(arr);
        List<Integer> nameList = List.of(0, 1, 2, 3, 4, 5);
        for (int i : nameList) {
            System.out.println(i);
        }
    }
    public void WhileLoopRefresher() {
    }
}