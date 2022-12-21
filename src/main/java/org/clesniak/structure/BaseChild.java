package org.clesniak.structure;

import org.clesniak.PracticeMain;

import java.io.Serializable;

public class BaseChild extends BaseClass {
    @Override
    public String doFizz(int x) {
        return "Child fizz\n" + super.doFizz(x);
    }

    @Override
    public String doBuzz(int z) {
        return "Basechild Buzz!";
    }
}
