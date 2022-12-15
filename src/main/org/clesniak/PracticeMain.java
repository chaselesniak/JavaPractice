package java.org.clesniak;


import java.org.clesniak.loops.ArraysListsAndLoops;
import java.org.clesniak.variables.VariablesTypesAndScope;

public class PracticeMain {
    public static void main(String[] args) {
        VariablesTypesAndScope p = new VariablesTypesAndScope();
        ArraysListsAndLoops f = new ArraysListsAndLoops();
        p.primitiveTypes();
        p.nonPrimitiveTypes();
        f.arraysForLoopRefresher();
        f.forEachLoopRefresher();
        f.whileLoopRefresher();
        f.iteratorRefresher();
        f.java8StreamsForEach();

    }

    /**
     * This is a JavaDoc Comment
     * @param prefix : this is an explanation of this parameter
     * @param postfix : ""
     * @return what it returns
     */
    public int javaDocInt(String prefix, String postfix) {
       return -1;
    }

}

