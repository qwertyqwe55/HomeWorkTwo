package com.netcracker.chapter1;

import javax.swing.*;

public class Substring {

    private String text;

    public Substring() {
        text = JOptionPane.showInputDialog("Enter the string for which you want to output all non-empty substrings: ");
    }

    public void substringString(){
        for (int i = 0; i < text.length(); i++) {
            for (int j = i+1; j <= text.length(); j++) {
                System.out.print(text.substring(i,j).replace(" ", "_") + "    ");
            }
        }
    }
}
