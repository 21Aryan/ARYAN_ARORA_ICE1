/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @author ARYAN ARORA
 */
public class CardTrick {
    
    public static void main(String[] args) {

        int valuex = 0;
        String suitx = null;
        Card[] magicHand = new Card[7];
        Scanner inputScan = new Scanner(System.in);
        Random rand = new Random();

        // Lucky Card logic
//        Card luckyCard = new Card();
//        luckyCard.setValue(7);
//        luckyCard.setSuit("Hearts");
        for (int i = 0; i < magicHand.length; i++) {
//        for (Card magicHand1 : magicHand) {
            Card c = new Card();
            int r;
            r = rand.nextInt(4);
            suitx = Card.SUITS[r];
            c.setSuit(suitx);
            r = rand.nextInt(13) + 1;
            c.setValue(r);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
//insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        boolean contLoop;

        Card cUser = new Card();
        do {
            contLoop = false;
            System.out.print("\nChoose a SUIT (1)Herats / (2)Diamonds / (3)Spades / (4)Clubs):\n");
            try {
                valuex = inputScan.nextInt();
                switch (valuex) {
                    case 1:
                        suitx = "Hearts";
                        break;
                    case 2:
                        suitx = "Diamonds";
                        break;
                    case 3:
                        suitx = "Spades";
                        break;
                    case 4:
                        suitx = "Clubs";
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Only 1-4. Try Again.");
                contLoop = true;
            }
            cUser.setSuit(suitx);
            inputScan = new Scanner(System.in);
        } while (contLoop);
        