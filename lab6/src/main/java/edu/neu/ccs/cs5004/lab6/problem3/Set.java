package edu.neu.ccs.cs5004.lab6.problem3;

/**
 * Created by Nuozhou Wang on 03/22/19.
 */
public interface Set<X> {

  /**
   * Create a new empty Set.
   *
   * @param <X> type of each element in this set
   * @return an empty set that can hold elements of type Y
   */
  static <X> Set<X> emptySet() {
    return new Empty<X>();
  }

  /**
   * Return the number of elements in this set.
   *
   * @return the number of elements in the set
   */
  Integer size();

  /**
   * Given an element prepending to this set
   *
   * @param element the element to add
   * @return the set with the element prepended
   */
  Set<X> add(X element);


  /**
   * Return true if this set is empty, and false otherwise.
   *
   * @return true if this set is empty and false otherwise
   */
  Boolean isEmpty();


  /**
   * Return true if an element x is included in the set.
   *
   * @param element the element to be checked.
   * @return true if element x is included in this set and false otherwise
   */
  Boolean contains(X element);

  /**
   * Given an element remove from this set
   *
   * @param element the element to be removed
   * @return the set with the element removed
   */
  Set<X> remove(X element);


}
