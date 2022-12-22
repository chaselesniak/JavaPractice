package org.clesniak.generics;

public class MyContainer<T> {
    private T obj;

    public MyContainer(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return obj;
    }

}
