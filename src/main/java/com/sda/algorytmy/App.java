package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] tab = {4, 6, 2, 1, 3};
        int wynik = tab[0];
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {

            if (tab[i] < wynik) {
                wynik = tab[i];
            }
        }
        for (int j = 1; j < tab.length; j++) {

            if (tab[j] > max) {
                max = tab[j];
            }
        }
        System.out.println("Min: " + wynik);
        System.out.println("Max: " + max);
    }
}
