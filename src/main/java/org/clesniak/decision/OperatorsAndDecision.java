package org.clesniak.decision;

public class OperatorsAndDecision {
    public void intDecision(int x) {
        if(x%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public void twoIntDecision(int x,int y) {
        if(x%2 == 0){
            System.out.println("x is Even");
            if(y>10){
               System.out.println("y is greater than 10");
            }
            else{
                System.out.println("y is less than 10");
            }
        }
        else{
            System.out.println("x is Odd");
        }
    }

    public void compoundTwoIntDecision(int x, int y) {
        if(x % 2 == 0 && y % 2 == 0) {
            System.out.println("x and y is Even");
        } else if (x % 2 == 0) {
            System.out.println("x is even only");
        } else if (y % 2 == 0) {
            System.out.println("y is even only");
        } else {
            System.out.println("Nothing is even");
        }
    }
    public void variableCompoundTwoDecision(int x, int y) {
        boolean isXEven = x % 2 == 0;
        boolean isYEven = y % 2 == 0;

        if(isXEven && isYEven) {
            System.out.println("x and y is Even");
        } else if (isXEven) {
            System.out.println("x is even only");
        } else if (isYEven) {
            System.out.println("y is even only");
        } else {
            System.out.println("Nothing is even");
        }

    }

    public void switchStatement(int score) {
        switch (score){
            case 1:
            case 2:
            case 3:
                System.out.println("Matched one two or three");
                break;
            case 4:
                System.out.println("Matched four");
                break;
            case 5:
                System.out.println("Matched five");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Matched 6 7 or 8");
                break;
            case 9:
            default:
                System.out.println("Fell through");
                break;
        }

    }
}
