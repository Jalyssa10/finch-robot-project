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
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);
        myFinch.setTurn("L", 10,50);
        myFinch.setTurn("R", 10,50);

        //360 Move + 180 move
        myFinch.setTurn("L", 360, 50);
       
        

        myFinch.stopAll();
        myFinch.disconnect();
    }
    //public void setBeak(int red, int green, int blue){
      //  bird.setBeak(0,100,0);
  //  }
}

