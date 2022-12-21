package org.clesniak.structure;

public class BaseMultiChild  extends BaseClass implements JazzInterface, BazzInterface {

    @Override
    public String doBazz() {
        return "BaseMultichild Bazz!";
    }

    @Override
    public String doBuzz(int z) {
        return "BaseMultiChild Buzz!";
    }

    @Override
    public String doJazz() {
        return "BaseMultichild Jazz!";
    }
}
