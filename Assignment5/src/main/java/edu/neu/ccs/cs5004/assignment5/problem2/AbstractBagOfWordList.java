package edu.neu.ccs.cs5004.assignment5.problem2;

public abstract class AbstractBagOfWordList implements BagOfWordsList {

  /**
   * Represents an Abstract class AbstractBagOfWordList that implements BagOfWordsList interface.
   *
   * @author nikkiwang
   */
  @Override
  public BagOfWordsList add(String word) {
    return addHelper(word, this);
  }

  /**
   * Add helper function.
   *
   * @param word --string to be added
   * @param curr -- curr BagOfWordsList
   * @return BagOfWordList with added new String
   */
  public BagOfWordsList addHelper(String word, BagOfWordsList curr) {
    if (curr instanceof Empty) {
      return new Cons(word, null);
    }
    if (word.compareTo(curr.getFirst()) > 0) {
      return new Cons(word, curr);
    }

    return new Cons(curr.getFirst(), new Cons(word, ((Cons) curr).getRestOfBag()));
  }
}
