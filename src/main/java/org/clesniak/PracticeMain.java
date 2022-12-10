package java.org.clesniak;

import java.util.List;

public class PracticeMain {
    public static void main(String[] args) {
        //Java Types Refreshing method
        typeRefresher();
        //Array and For Loop method
        arraysForLoopRefresher();

    }

    /**
     * This is a JavaDoc Comment
     * @param prefix : this is an explanation of this parameter
     * @param postfix : ""
     * @return what it returns
     */
    private int javaDocInt(String prefix, String postfix) {
       return -1;
    }
    private static void typeRefresher() {
        //single line
        /* multi
        line */

        //Primitive Types
        int brendan = 0;
        double chase = 1.0;
        float number = 16.0f;
        boolean isTrue = true;
        char character = 'c';
        byte num1 = 100;
        short num2 = 16_000;
        long num3 = 8_000_000_000L;

        //Non-primitive types
        String stronk = "hello!";
        Boolean numbers = isTrue;
        PracticeMain chase2 = new PracticeMain();
        Integer javaDocReturn = chase2.javaDocInt("",null);

        //Local Variables type inference
        var jars = new PracticeMain();
    }
    private static void arraysForLoopRefresher(){
        //Basic For-Loop Construction
        //Array initialized with all 0's
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int randomVariable = -1;
            arr[i] = i;
        }
        //randomVariable only accessible inside for loop
        // arr = [0,1,2,3,4,5,6,7,8,9]

        //For-each loop construction
        //List<Integer> nameList = Arrays.asList(arr);
        List<Integer> nameList = List.of(0,1,2,3,4,5);
        for(int i: nameList) {
            System.out.println(i);
        }
    }
}
