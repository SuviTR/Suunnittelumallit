
package templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MathGame extends Game { 
    
    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> results = new ArrayList<Integer>();
    private boolean end = false;
    private int answer = 0;  
    private int rightAnswers;
    
    /* Implementation of necessary concrete methods */        
    void initializeGame() {      
        System.out.println("Math Game Initialized! Start playing.");
    }        
    void makePlay(int player) {   
        System.out.println("Player " + player + "\n");
        players.add(getQuestions()); 
    }       
    
    boolean endOfGame() {
        return end;
    }        
    
    void printWinner() {          
        int i = players.indexOf(Collections.max(players));
        System.out.println("The winner is player number: " + i 
        + " with " + results.get(i) + " right answers.");
    } 
        
    /* Specific declarations for the Monopoly game. */   
    private int getQuestions() {
        
        rightAnswers = 0;
        
        if (question1()) {
            end = true;
        }
        if (question2()) {
            end = true;
        }     
        else {
            end = false;
        }

        results.add(rightAnswers);
        return rightAnswers;
    }
    
    private boolean question1() {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mitä on 1+3?");   
        answer = Integer.parseInt(lukija.next());   
        
        if(answer == 4) {
            rightAnswers++; 
            System.out.println("q1: oikein\n");
            return false;
        }
        else {
            System.out.println("q1: väärin\n");
            return true;
        }
        
    }
    
    private boolean question2() {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mitä on 4*9?");   
        answer = Integer.parseInt(lukija.next());    
        if(answer == 36) {
            rightAnswers++;
            System.out.println("q2: oikein\n");
            return false;
        }
        else {
            System.out.println("q2: väärin\n");
            return true;
        }
    }
}
