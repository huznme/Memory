/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjktMemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Keenn
 */
public class Board {

    private final int size;

    public Board(int size) {
        this.size = size;
    }
/**
 * This method is responsoble for shuffeling the list of cards.
 * 
 * @param deck
 * @return 
 */
    public List<Card> shuffleBoard(List<Card> deck) {
        Card tempCard;
        int rngNum;

        Random rng = new Random();

        for (int i = 0; i < 5; i++) {                   // Repeate 5times
            for (int x = 0; x < deck.size(); x++) {     // Swap process
                tempCard = deck.get(x);               // A hold place for the card that gonna swap
                rngNum = rng.nextInt(deck.size());      // Get a random number from 0 to deck size
                deck.set(x, deck.get(rngNum));         // the place [x] is replace with place [rng_num] 
                deck.set(rngNum, tempCard);              // the place[rng]is replace with temp_card so it wont get duplicated  

            }
        }

        return deck;
    }

    public List<Card> initCardsColor() {
        int index = 0;
        List<Card> deck = new ArrayList<>();
        String[] colors = {"Grey", "Grey", "Brass", "Brass", "Rose", "Rose", "Cyan", "Cyan", "Olive", "Olive", "Aero", "Aero", "Violet", "Violet", "Pink", "Pink", "Amber", "Amber", "Crimson", "Crimson", "Azura", "Azura", "Beige", "Beige", "Brown", "Brown", "Blue", "Blue", "Red", "Red",
            "Green", "Green", "Blue", "Blue", "Yellow", "Yellow", "Purple", "Purple", "Orange", "Orange"};

        if (size % 2 == 0) { //if the size is even

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    deck.add(new Card(colors[index], index));
                    index++;
                }
            }
        } else {
            System.err.println("Error in Card.setColorBoard()");
            System.err.println("Error! The size must be even");
            System.exit(size);
        }

        return deck;

    }
/**
 * This method prints all the cards in the list.
 * @param deck
 * @param showCard 
 */
    public void printAllCard(List<Card> deck, boolean showCard) {
        int i = 0;
        for (Card card : deck) {
            if (i % size == 0) { //new line
                System.out.println("\n");
            }
            card.showCard(showCard);
            i++;
        }
        System.out.println();
    }
/**
 * This method is responible for showing the flipped cards.
 * 
 * @param deck
 * @param cardNum 
 */
    public void printColorsCard(List<Card> deck, int cardNum) {

        for (int i = 0; i < deck.size(); i++) {

            if (i % size == 0) {
                System.out.println("\n");
            }

            if (i == cardNum) {
                deck.get(i).showCard(true);

            } else {
                System.out.printf("[ %2d]", i);
            }
        }
        System.out.println();
    }
/**
 * This method is comparing the flipped cards to see if they match or not.
 * 
 * @param card1
 * @param card2
 * @return 
 */
    public boolean compareCard(Card card1, Card card2) {
        return card1 == card2;
    }
}

/*
 public boolean fullBoard() {

 // if they match it means that the board is full
 return totalCards == matchedCards.size();
 }

 public Card[][] shuffleBoard(Card[][] cards) {

 int rng_num;
 Random rng = new Random();
 Card tempCard;
      
 for (int i = 0; i < 5; i++) {       //shuffle 5times
 for (Card[] card : cards) {
 for (int x = 0; x < card.length; x++) {
 tempCard = card[x];
 rng_num = rng.nextInt(boardGRID.length);
 card[x] = card[rng_num]; //swap the card
 card[rng_num] = tempCard;
 }
 }
 }

 return cards;
 }

 public void printHiddenBoard() {
 for (int[] matri : boardGRID) {
 for (int j = 0; j < matri.length; j++) {
 System.out.print("[<>]");
 }
 System.out.println();
 }
 }

 public void printFlippedCard() {
 int temp;
 for (int[] boardGRID1 : boardGRID) {
 for (int j = 0; j < boardGRID1.length; j++) {
 temp = boardGRID1[j];
 // check if matchedCards vs value is in list
 if (matchedCards.contains(temp)) {

 System.out.print("[ X ]");

 } else {
 System.out.print("[ ? ]");
 }
 }
 System.out.println();
 }

 }
 public void printCard(Position pos1) {
 int x = pos1.getX();
 int y = pos1.getY();

 for (int i = 0; i < boardGRID.length; i++) {
 for (int j = 0; j < boardGRID[i].length; j++) {

 if (i == x && j == y) {
 System.out.printf("[%3d]", boardGRID[i][j]);

 } else {
 System.out.print("[<>]");
 }
 }
 System.out.println();
 }
 }

 public int getCard(int x, int y) {
 return boardGRID[x][y];
 }

 public boolean compareCard(Position pos1, Position pos2) {
 int value1;
 int value2;
 value1 = boardGRID[pos1.getX()][pos1.getY()];
 value2 = boardGRID[pos2.getX()][pos2.getY()];

 return (value1 == value2);
 }


 public void addMatchedCardsToList(int pos1, int pos2) {
 int value1, value2;

 value1 = boardGRID[pos1.getX()][pos1.getY()];
 value2 = boardGRID[pos2.getX()][pos2.getY()];

 // If pos1 value equal to pos2 value  
 if (value1 == value2) {
 matchedCards.add(value1);

 }

 }
 */
