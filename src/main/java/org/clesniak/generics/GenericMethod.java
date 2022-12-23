package org.clesniak.generics;

public  class GenericMethod {

    public static <T> String  genericPrint(T element) {
        return (element.getClass().getName() + " = " + element);
    }

    public static <T extends Number> String  genericNumber(T element) {
        return (element.getClass().getName() + " = " + element);
    }
}
