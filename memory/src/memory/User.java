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
public class User {

    private final String name;
    private int scores;

    public User(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getScores() {
        return scores;
    }

    public void incScores(int scores) {
        this.scores += scores;
    }

    public void decrScores(int scores) {
        this.scores -= scores;
    }

}
