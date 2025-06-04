package com.dancing;

import com.birdbrain.Finch;

public class danceMoves {
    public static void main(String[] args) {
        //declares the finch robot
      Finch myFinch = new Finch();
        //Moves fowards then backwards
        myFinch.setMove("F",50,50);
        myFinch.setMove("B",50,50);
       
       //Side to side moves
       for(int i=0; i< 4; i++){
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);
       };
        

        //360 Move
        myFinch.setTurn("L", 360, 50);
        // blink after the left turn
        myFinch.setBeak(0,100,0);
        myFinch.pause(0.5);
        myFinch.setBeak(0,0,0);

       //180 move
        myFinch.setTurn("R",180, 50);
        //blink after the right turn
        myFinch.setBeak(0,100,0);
        myFinch.pause(0.5);
        myFinch.setBeak(0,0,0);

        //Backward moving
        myFinch.setMove("B",50,50);
       
        //Lights
        for(int i = 0; i<2; i++){
          myFinch.setBeak(0,100,0);
        myFinch.pause(0.5);
        myFinch.setBeak(0,0,0);
        }

        myFinch.stopAll();
        myFinch.disconnect();

        //Musica
        myFinch.playNote(60,0.5);
    }

}

