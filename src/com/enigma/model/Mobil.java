package com.enigma.model;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Mobil {
     private Integer postX;
     private Integer postY;
     private Integer fuel = 0;

     private char [] commands;
     private final String FORWARD = "F";
     private final String BACKWARD = "B";
     private final String LEFT = "L";
     private final String RIGHT = "R";

     public Mobil(Integer x, Integer y) {
         this.postX = x;
         this.postY = y;
     }

     public void getFuel(Integer fuel) {
         this.fuel = this.fuel + fuel; //
     }

     private void move(String movement) {
         if (movement.equals(RIGHT)) {
             this.postX++;
         } else if (movement.equals(LEFT)) {
             this.postX--;
         } else if (movement.equals(BACKWARD)) {
             this.postY--;
         } else if (movement.equals(FORWARD)) {
             this.postY++;
         }
     }

     public void setCommands(String commands){
         this.commands = commands.toCharArray();
     }

     public String getPost(){
         return "(" + postX + "," + postY + ")";
     }

     public void run(){
         for (int i=0; i < this.commands.length; i++){
             if (fuel == 0){
                 System.out.println("Tidak Ada Bensin! ");
                 break;
             }

             move(String.valueOf(this.commands[i]));
             System.out.println(this.commands[i] + getPost());
                if ((i+1) % 3 == 0){
                 fuel--;
             }
        }
    }

    public String print() {
        return "Mobil {" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commands=" + Arrays.toString(commands) +
                ", Forward='" + FORWARD + '\'' +
                ", Backward='" + BACKWARD + '\'' +
                ", Left='" + LEFT + '\'' +
                ", Right='" + RIGHT + '\'' +
                '}';
    }
}
