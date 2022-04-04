package com.bridgelabz;

public class Players {
    int p;
    public Players(int p) {
        this.p = p;
    }
    public void sequence(){
        int[] seq = new int[p];
        seq[0] = (int) ((Math.random()*10)%p);
        System.out.println("Game will start from Player"+(seq[0]+1));
        for (int i = 1; i < p; i++){
            seq[i]=(seq[i-1]+1)%p;
        }
        System.out.println("Players will get cards in below seq");
        for (int i = 0; i < p; i++)
            System.out.println((i+1)+" Player"+(seq[i]+1));
    }

}
