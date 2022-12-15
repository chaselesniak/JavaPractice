package org.clesniak;


import org.clesniak.decision.OperatorsAndDecision;
import org.clesniak.loops.ArraysListsAndLoops;
import org.clesniak.variables.VariablesTypesAndScope;

public class PracticeMain {
    public static void main(String[] args) {
        VariablesTypesAndScope p = new VariablesTypesAndScope();
        ArraysListsAndLoops f = new ArraysListsAndLoops();
        OperatorsAndDecision o = new OperatorsAndDecision();
        p.primitiveTypes();
        p.nonPrimitiveTypes();
        f.arraysForLoopRefresher();
        f.forEachLoopRefresher();
        f.whileLoopRefresher();
        f.iteratorRefresher();
        f.java8StreamsForEach();
        f.loop(5);
        o.intDecision(3);
        o.twoIntDecision(4,12);
        o.compoundTwoIntDecision(12,84);
        o.compoundTwoIntDecision(13,45);
        o.variableCompoundTwoDecision(2,1);
        o.variableCompoundTwoDecision(5,6);
        o.switchStatement(1);
        o.switchStatement(4);
        o.switchStatement(7);
        o.switchStatement(30);

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

