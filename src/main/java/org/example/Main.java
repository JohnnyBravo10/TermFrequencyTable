package org.example;

public class Main {
    public static void main(String[] args) {
        Term_frequency_table t = new Term_frequency_table("Ciao Giovanni ciao buonasera buonasera");
        System.out.print(t.table);
    }
}