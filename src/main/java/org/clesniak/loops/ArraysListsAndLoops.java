package java.org.clesniak.loops;

import java.util.Iterator;
import java.util.List;

public class ArraysListsAndLoops {
    public void arraysForLoopRefresher() {
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

    public void forEachLoopRefresher(){
        //For-each loop construction
        //List<Integer> nameList = Arrays.asList(arr);
        List<Integer> nameList = List.of(0, 1, 2, 3, 4, 5);
        for (int i : nameList) {
            System.out.println(i);
        }
    }

    public void whileLoopRefresher() {
        int counter = 10;
        while(counter > 0){
            counter--;
        }
    }

    public void iteratorRefresher(){
        List<String> stringlist = List.of("This","Is","A", "String");
        Iterator<String> i = stringlist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public void java8StreamsForEach(){
        List<Integer> intList = List.of(4,3,6,8,9,5,4,2,6,4);
        //Prints out the elements of the list of integers
        //This one prints out the integers
        intList.forEach(System.out::println);
        intList.forEach((i) -> System.out.println(i));
        //converts each element to string before printing
        intList.forEach((i) -> {
            String s = i.toString();
            System.out.println(s);
        });
        //utilizes stream() and stream().map to grab each element and print out the contents(converts to string)
        intList.stream().map((i) -> i.toString()).forEach((i) -> System.out.println(i));
        //intList.stream().map(Integer::toString).forEach(System.out::println);

    }
}