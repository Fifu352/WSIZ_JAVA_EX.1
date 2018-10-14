//WSIZ Podstawy_programowania_1 EX.1 13.10.2018

package com.company;

/**
 * This is a tiny program, which should print out the multiplication table
 */
public class Main {
    public static void main(String[] args) {
        /*Variable storing both the numbers and placeholders for the multiplication table*/
        String[][] table_of_values;
        table_of_values = new String[10][10];

        System.out.println("Ex.1 13.10.2018\nMultiplication table:\n");
        for (int i = 1; i < table_of_values.length; i++) {
            for (int j = 1; j < table_of_values[i - 1].length; j++) {
                if (i * j < 10) {
                    table_of_values[i][j] = "|0" + i * j;
                } else {
                    table_of_values[i][j] = "|" + i * j;
                }
            }
        }

        for (int i = 1; i < table_of_values.length; i++) {
            for (int j = 1; j < table_of_values[i - 1].length; j++) {
                System.out.print(table_of_values[i][j]);
            }
            System.out.println("|");
        }
    }
}