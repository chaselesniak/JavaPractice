package org.clesniak.generics;

public class MultiContainer<K,V extends Number>  {

    private K key;
    private V value;


    public MultiContainer(K key,V value) {
        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
