package edu.neu.ccs.cs5004.assignment5.problem2;

/**
 * Represents a BagOfWordsList.
 */
public interface BagOfWordsList {

  /**
   * Creates a new empty Cons.
   *
   * @return new empty Cons
   */
  static Empty emptyBagOfWords() {
    return new Empty();
  }

  /**
   * Check if the Cons is empty.
   *
   * @return if the Cons is empty.
   */
  Boolean isEmpty();

  /**
   * Get the size of the Cons.
   *
   * @return the size
   */
  Integer size();

  /**
   * Getter for property 'first'.
   *
   * @return String for property 'first'.
   */
  String getFirst();

  /**
   * Returns a linked list containing information about the rest of the Cons.
   *
   * @return - a linked list containing information  about the rest of the Cons
   */
  BagOfWordsList getRestOfBag();

  /**
   * Add new string to Cons.
   *
   * @param word -- new string
   * @return -- new BafOfWords
   */
  BagOfWordsList add(String word);

  /**
   * Check if a string is in the Cons.
   *
   * @param word -- string
   * @return Boolean - if the string is in the Cons
   */
  Boolean contains(String word);


}
