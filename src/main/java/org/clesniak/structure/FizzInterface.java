package org.clesniak.structure;



public interface FizzInterface  {
    String doFizz(int x);

    default String doBuzz(int z) {
        return "I did a buzz";
    }
}
