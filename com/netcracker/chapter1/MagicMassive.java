package com.netcracker.chapter1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicMassive {

    private int[][] array;
    private int size;
    private boolean flag;
    public MagicMassive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array(one number): ");
        try {
            size = scanner.nextInt();
            array = new int[size][size];
            System.out.println("Enter matrix: ");
            for (int i = 0; i < size; i++) {
                array[i] = new int[size];
                for (int j = 0; j < size; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            flag = true;
        }catch (Exception e){
            System.out.println("Wrong input data");
            flag = false;
        }
    }

    public boolean checkMagic(){
        Set<Integer> sums = new HashSet<>();
        int summa = 0;

        summaDiagonal(summa,sums);
        summaRows(summa,sums);
        summaColums(summa,sums);

        if(!flag) return false;
        return sums.size() == 1;
    }

    private void summaColums(int summa, Set<Integer> sums){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                summa += array[j][i];
            }
            sums.add(summa);
            summa = 0;
        }
    }

    private void summaRows(int summa, Set<Integer> sums){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                summa += array[i][j];
            }
            sums.add(summa);
            summa = 0;
        }
    }

    private void summaDiagonal(int summa, Set<Integer> sums){
        for (int i = 0; i < size; i++) {
            summa += array[i][i];
        }
        sums.add(summa);
        summa = 0;
        for (int i = size-1; i >= 0; i--) {
            summa += array[i][i];
        }
        summa = 0;
    }


}
