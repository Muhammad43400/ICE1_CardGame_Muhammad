/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        // Fill the array with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            int randomValue = (int) (Math.random() * 13) + 1;
            int randomSuitIndex = (int) (Math.random() * 4);

            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuitIndex]);

            magicHand[i] = c;
        }

        // Hard-coded lucky card (2 of Clubs)
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        magicHand[0] = luckyCard;

        // Ask the user for card value and suit
        Scanner input = new Scanner(System.in);

        System.out.print("Pick a card value (1-13): ");
        int userValue = input.nextInt();
        input.nextLine();

        System.out.print("Pick a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = input.nextLine();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand
        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].equals(userCard)) {
                found = true;
                break;
            }
        }

        // Report result
        if (found) {
            System.out.println("Your card IS in the magic hand!");
        } else {
            System.out.println("Sorry, your card is NOT in the magic hand.");
        }


        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);      
        luckyCard.setSuit("Clubs");

magicHand[0] = luckyCard;  // place lucky card into the hand

    }
}
