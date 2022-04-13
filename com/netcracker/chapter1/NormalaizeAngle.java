package com.netcracker.chapter1;

import javax.swing.*;

public class NormalaizeAngle {

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    private int angle;

    public NormalaizeAngle() {
        angle = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer angle: "));
    }

    public int normalaizeAngle(){
            angle = angle % 360;
            if (angle < 0) {
                angle = angle + 360;
            }
            return angle;
    }

    public int normalaizeAngleFloorMod(){
        angle = Math.floorMod(angle,360);
        if (angle < 0) {
            angle = angle + 360;
        }
        return angle;
    }

}
