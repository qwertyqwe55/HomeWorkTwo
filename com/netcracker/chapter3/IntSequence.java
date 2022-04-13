package com.netcracker.chapter3;

import java.util.ArrayList;


public    class IntSequence {


    public IntSequence() {
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    public void printArray(){
        System.out.print("Sequence = ");
        for (int number : list){
            System.out.print(number + " ");
        }
    }

    public IntSequence(ArrayList<Integer> list) {
        this.list = list;
    }

    public static IntSequence constans(int number){
        for (int i = 0; i < 100000; i++) {
            list.add(number);
        }
        return new IntSequence(list);
    }

    public static IntSequence of(int... array){
        return new IntSequence() {
            public void addArray(){
                for(int i : array){
                    list.add(i);
                }
            }
            {
               addArray();
            }
        };
    }

}
