/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjktMemory;

/**
 *
 * @author Keenn
 */
public class Card {

    private final String cardName;
    private final int cardNum;

    public Card(String theBack, int cardID) {
        this.cardName = theBack;
        this.cardNum = cardID;
    }

    public String getCardBack() {
        return this.cardName;
    }

    public int getCardNum() {
        return this.cardNum;
    }

    public void showCard(boolean showing) {
        if (showing) {
            System.out.printf(" [ %2s] ", cardName);

        } else {
            System.out.printf(" [ Id:%s] ", cardNum);
        }

    }
}
