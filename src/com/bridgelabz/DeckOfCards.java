package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args){
        String[] suit = {"Clubs","Diamonds","Hearts","Spade"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[][] deck = new String[4][13];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[i][j] = suit[i] +" "+rank[j];
            }
        }
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j < 13; j++){
//                System.out.print(deck[i][j]+" ");
//            }
//            System.out.println("\n");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Players");
        int p = sc.nextInt();
        while (p < 3 || p > 4){
            System.out.println("Enter member between 3 to 4");
            p = sc.nextInt();
        }
        Players pl = new Players(p);
    }
}
