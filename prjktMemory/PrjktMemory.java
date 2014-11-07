/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjktMemory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keenn
 */
public class PrjktMemory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 4;
        List<Card> usedCard;
        List<Card> listOfCard = new ArrayList<>();
        Board board = new Board(size);

        listOfCard = board.initCardsColor();

        board.printAllCard(listOfCard, true);
        board.shuffleBoard(listOfCard);
        board.printColorsCard(listOfCard, 5);
        
       // board.printAllCard(listOfCard, false);

        //board.printColorsCard(listOfCard, 3);

        /*
         // System.out.println("________________________");
         //  board.printHiddenBoard();
         System.out.println("________________________\n");

         board.printCard(pos1);
         System.out.println("________________________\n");

         board.printCard(pos2);
        
         System.out.println("________________________\n");

        

         System.out.println("\npos1=pos2-> "+ board.compareCard(pos1, pos2));
         if(board.compareCard(pos1, pos2)){
         board.addMatchedCardsToList(pos1, pos2);
         }
         board.printFlippedCard();
         */
    }

}
