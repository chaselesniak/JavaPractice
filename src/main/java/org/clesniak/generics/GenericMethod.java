package org.clesniak.generics;

public class GenericMethod <T> {
    private T obj;

    public GenericMethod(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return obj;
    }

    public <T> void genericPrint(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
