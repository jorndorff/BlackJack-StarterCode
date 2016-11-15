public class BlackJack {

  /* Given a deck, will play 1 hand of BlackJack and record the number of times you get the value and the number of times you are safe when you hit at that value */ 
  public static void playHand(int[] deck)


  /* Uses the deck to simulate sevral (numTimes) different hands by calling playHand */
  public static void simulate(int[] deck, int numTimes)


  /* Returns a new deck, in order. The suit does not matter, so the
  array will contain 1 (A), 2, 3, 4, ..., 10, 10 (J), 10 (Q), 10 (K). The 
  array should have 53 spots, so the last spot will hold the index of
  the top card (which should be zero to start). */
  public static int[] buildDeck()


  /* Randomize the array by going through it and swapping every
  item with another value from a random index from 0 to 51.  */
  public static void shuffle(int[] deck)


  /* Return the top card and increment the top card variable, unless 
  you have hit the end of the array. In that case, shuffle the deck
  and set the top card variable to 0. */ 
  public static int getCard(int[] deck)


  /* Calculate the odds */
  public static double[] calculateOdds()


  /* Returns whether or not you should hit, based on your current odds. Note- your program should handle this differently than a human player would! For example, a human player, if the odds are 60% that they should hit, would actually hit every time. Your program should take this more literally. If there is a 60% chance that your program would hit, then it should return true 60% of the time! */
  public static boolean shouldIHit(int currVal)
  
}
