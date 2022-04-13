package com.netcracker.chapter1;

import java.util.ArrayList;
import java.util.Random;

public class Lottery {

    private static ArrayList<Integer> numbers;

    public Lottery() {
        numbers = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            numbers.add(i);
        }
    }

    public int[] createLotteryBilet(){
        int[] bilet = new int[6];
        Random random = new Random();
        int size = 49;
        for (int i = 0; i < 6; i++) {
            bilet[i] = numbers.remove(random.nextInt(size));
            size--;
        }

        return sort(bilet);
    }

    public int[] sort(int[] bilet) {
        for (int i = 0; i < bilet.length; i++) {
            for (int j = i+1; j < bilet.length; j++) {
                if (bilet[i] > bilet[j]) {
                    int t = bilet[i];
                    bilet[i] = bilet[j];
                    bilet[j] = t;
                }
            }
        }
        return bilet;
    }
}

