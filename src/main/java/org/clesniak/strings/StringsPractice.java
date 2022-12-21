package org.clesniak.strings;

public class StringsPractice {

    public void stringComparison(String s) {
        String t = "goal";
        if (s.compareTo(t) == 0) {
            System.out.println("These are equal");
        } else if (s.compareTo(t) < 0) {
            System.out.println(s + " is lexigraphically before goal");
        } else {
            System.out.println(s + " is lexigraphically after goal");
        }

        if (s.compareToIgnoreCase(t) == 0) {
            System.out.println("These are equal ignoring Upper/Lower case");
        } else if (s.compareToIgnoreCase(t) < 0) {
            System.out.println(s + " is lexigraphically before goal ignoring Upper/Lower case");
        } else {
            System.out.println(s + " is lexigraphically after goal ignoring Upper/Lower case");
        }

        if (s.startsWith(t)) {
            System.out.println(s + " starts with goal");
        } else {
            System.out.println(s + " does not start with goal");
        }

        if (s.endsWith(t)) {
            System.out.println(s + "ends with goal");
        } else {
            System.out.println(s + " does not end with goal");
        }

    }

    public void replace() {
        //String.replace(char1, char2) replaces all instances of char1 with char2
        System.out.println("jawwas".replace('w','s'));
        CharSequence charSeq1 = "FOW";
        CharSequence charSeq2 = "FGHJ";
        System.out.println("FOWJWOIJ".replace(charSeq1,charSeq2));
        //replaceFirst(x,y) replaces only the first instance of substring x with substring y
        System.out.println("wastwas".replaceFirst("twas", "te"));
    }


}
