
Black Jack Strategy Generator
=============================


About This Project
------------------
This project uses arrays to keep track of odds for the game Black Jack. If you are not familiar with the game, take a minute and read the rules. [Wikipedia](https://en.wikipedia.org/wiki/Blackjack) is one good source. In this lab we will use a slightly simplified version of the game in which the user can only choose to Hit or Stay. No splitting or doubling down.


The program seeks to answer this question: Given a blackjack hand, should I hit or stay? Your program will run simulations to help answer this question. To run these simulations, you will need the following methods:


The BlackJack Class
-------------------
This class defines several useful methods for simulating and playing black jack games. The required methods are outlined in the `BlackJack.java` file. Implement them there, and document them with javadoc. You may, or course, add additional methods as you see fit.

The Main Program
----------------
The BlackJack class will be useful for several different black jack related programs, not just our basic strategy generator.

Your program will simulate many hands of blackjack and keep track of how often the player busts for each hand value. Find a way to record each time whether hitting on a given number was successful. How you choose to record this is up to you, but once your simulation is complete, it should offer the odds that you SHOULD hit at any given total, and print a nice table like the following to the screen. 

| HAND | ODDS |
| ---- | ---- |
| 0    | N/A  |
| 1    | N/A  |
| 2    | 1    |
| 3    | 1    |
| 4    | 1    |
| 5    | 1    |
| 6    | 1    |
| 7    | 1    |
| 8    | 1    |
| 9    | 1    |
| 10   | 1    |
| 11   | 1    |
| 12   | .70  |
| 13   | .67  |
| 14   | .53  |
| 15   | .45  |
| 16   | .31  |
| 17   | .21  |
| 18   | .12  |
| 19   | .07  |
| 20   | .02  |

The exact odds will be different every time, especially for a small number of simulated hands, but these are representative. Any total 11 or lower should always result in a successful hit and as your number increases, the odds of a successful hit should decrease. 


Once you have all this, I should be able to actually play blackjack in AC and trust your program whether or not I should hit. Consider this rough main method:

```java
public static void main(String [] args)
{
	// Ask user how many sims to run
	
	
    // Ultimate results variable
    double[] odds;

    int[] deck = buildDeck();
    shuffle(deck);
    
    simulate(deck, numSims);
    
    // Make the final calculation
    odds = calculateOdds();
    printTable();
    
    // Ask the user thier hand and tell them whether they should hit.
}
```


The Assignment
--------------

* Comment your code in JavaDoc format.

* Your code should be well-commented and stylistically correct. 

* Make sure to update this document so it reads as an actual documentation rather than an assignment. (Hint remove this section.)

* For extra street cred, allow the options to split or double down.

* For even more street cred allow a different number of decks in the shoe. A common value in casinos is six decks per shoe.








