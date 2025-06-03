package com.dancing;

import com.birdbrain.Finch;

public class danceMoves {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60,0.5);

        //Foward moves
        myFinch.setMove("F",50,50);
        myFinch.setMove("B",50,50);
       
       //Side to side moves
       for(int i=0; i< 4; i++){
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);
       };
        

        //360 Move + 180 move
        myFinch.setTurn("L", 360, 50);
        myFinch.setTurn("R",180, 50);

        //Backward moving
        myFinch.setMove("B",50,50);
       
        //Lights
        for(int i = 0; i<3; i++){
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

