package java.org.clesniak.variables;

import java.org.clesniak.PracticeMain;

public class VariablesTypesAndScope {
    int x,y,z;
    public void main(String[] args) {
        this.x = 0;
        this.y = 0;
        this.z = 0;

    }
    public void main(String[] args, int y1, int x1, int z1) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
    }

    //Private variables only accessible in this class
    private int w = 0;
    //Public variables accessible from anywhere
    public float p = 10f;
    //Protected variables accessible from classes of the same package and subclasses in any package
    protected boolean f = true;

    public static void PrimitiveTypes() {
        //single line
        /* multi
        line */

        //Primitive Types
        int brendan = 0;
        double chase = 1.0;
        float number = 16.0f;
        boolean isTrue = true;
        char character = 'c';
        byte num1 = 100;
        short num2 = 16_000;
        long num3 = 8_000_000_000L;

    }

    public static void NonPrimitiveTypes() {
        boolean isTrue = true;
        //Non-primitive types
        String stronk = "hello!";
        Boolean numbers = isTrue;
        PracticeMain chase2 = new PracticeMain();
        Integer javaDocReturn = chase2.javaDocInt("", null);

        //Local Variables type inference
        var jars = new PracticeMain();
    }
}