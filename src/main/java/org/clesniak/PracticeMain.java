package org.clesniak;


import org.clesniak.decision.OperatorsAndDecision;
import org.clesniak.exceptions.BasicIOWithExceptionHandling;
import org.clesniak.generics.GenericMethod;
import org.clesniak.generics.MultiContainer;
import org.clesniak.generics.MyContainer;
import org.clesniak.loops.ArraysListsAndLoops;
import org.clesniak.strings.StringsPractice;
import org.clesniak.structure.*;
import org.clesniak.variables.VariablesTypesAndScope;

import java.nio.file.NoSuchFileException;

public class PracticeMain {
    public static void main(String[] args) throws Exception {
        VariablesTypesAndScope p = new VariablesTypesAndScope();
        ArraysListsAndLoops f = new ArraysListsAndLoops();
        OperatorsAndDecision o = new OperatorsAndDecision();
        StringsPractice s = new StringsPractice();
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
        o.stringsAndObjectsEqual("twas");
        o.stringsAndObjectsEqual("was");
        s.stringComparison("goal");
        s.stringComparison("foal");
        s.stringComparison("Goal");
        s.stringComparison("Jones");
        s.replace();


        BaseClass base1 = new BaseClass();
        BaseClass baseChild = new BaseChild();
        BaseClass multiBase = new BaseMultiChild();
        BaseChild child1 = new BaseChild();
        BaseMultiChild multiChild = new BaseMultiChild();
        FizzInterface baseInterface = new BaseClass();
        FizzInterface childInterface = new BaseChild();
        FizzInterface multiInterface = new BaseMultiChild();
        JazzInterface jazzInterface = new BaseMultiChild();
        BazzInterface bazzInterface = new BaseMultiChild();


        System.out.println("Child Hierarchy Evaluation");
        System.out.println("===========================");
        System.out.println(base1.doFizz(1));            // will print "Baseclass Fizzes!"
        System.out.println(baseChild.doFizz(1));        // will print "Child fizz" -newline- "Baseclass Fizzes"
        System.out.println(child1.doFizz(1));           // will print "Child fizz" -newline- "Baseclass Fizzes"
        System.out.println(baseInterface.doFizz(1));    // will print "Baseclass Fizzes!"
        System.out.println(childInterface.doFizz(1));   // will print "Child fizz" -newline- "Baseclass Fizzes"
        System.out.println(base1.doBuzz(1));            // will print "I did a buzz"
        System.out.println(baseChild.doBuzz(1));        // will print "basechild Buzz"
        System.out.println(child1.doBuzz(1));           // will print "basechild buzz"
        System.out.println(baseInterface.doBuzz(1));    // will print "I did a buzz"
        System.out.println(childInterface.doBuzz(1));   // will print "basechild buzz"

        System.out.println("Implementing multiple Interfaces/Hierarchy");
        System.out.println("===========================");
        System.out.println(multiBase.doFizz(1));        // will print "Baseclass fizzes"
        System.out.println(multiBase.doBuzz(1));        // will print "BaseMultiChild Buzz!"
        System.out.println(multiChild.doBuzz(1));       // will print "BaseMultiChild Buzz!"
        System.out.println(multiChild.doBazz());           // will print "BaseMultiChild Bazz!"
        System.out.println(multiChild.doJazz());           // will print "BaseMultiChild Jazz!"
        System.out.println(multiInterface.doBuzz(1));   // will print "BaseMultiChild Buzz!"
        System.out.println(multiInterface.doFizz(1));   // will print "Baseclass Fizz!"
        System.out.println(jazzInterface.doJazz());        // will print "BaseMultiChild jazz!"
        System.out.println(bazzInterface.doBazz());        // will print "BaseMultiChild Bazz!"

        MyContainer<String> stringContainer = new MyContainer<>("Generic String");
        MyContainer<Integer> integerContainer = new MyContainer<>(32);
        MultiContainer<String,Integer> multiContainerSI = new MultiContainer<>("key",20);


        // MultiContainer<String,String> multiContainerS = new MultiContainer<>("key","value");
        // Above results in a compiler error as value in multicontainer class extends Number
        System.out.println(multiContainerSI.getKey() + " " + multiContainerSI.getValue());
        System.out.println(stringContainer.getObject());
        System.out.println(integerContainer.getObject());

        System.out.println(GenericMethod.genericPrint("String"));
        System.out.println(GenericMethod.genericPrint(15));
        System.out.println(GenericMethod.genericPrint(15L));


        // System.out.println(GenericMethod.genericNumber("String"));
        // will not work as genericNumber is confined by Number
        System.out.println(GenericMethod.genericNumber(15));
        System.out.println(GenericMethod.genericNumber(15L));


        //IO AND EXCEPTION HANDLING
        //==========================
        BasicIOWithExceptionHandling basicIO = new BasicIOWithExceptionHandling();
        basicIO.readFileNotFound();
        basicIO.readFileNotFound_RethrowException();



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

