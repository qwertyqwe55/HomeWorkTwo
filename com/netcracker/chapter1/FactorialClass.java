package com.netcracker.chapter1;

import javax.swing.*;
import java.math.BigInteger;

public class FactorialClass {
    private BigInteger number;

    public FactorialClass() {
        number = BigInteger.valueOf(Long.parseLong(JOptionPane.showInputDialog("Enter a number to calculate its factorial: ")));
    }

    public BigInteger evaluateFactorial(){
        if(number.compareTo(BigInteger.valueOf(1)) == 0){
            return BigInteger.valueOf(1);
        }else{
            number = number.add(BigInteger.valueOf(-1));
            return number.multiply(evaluateFactorial());
        }
    }
}
