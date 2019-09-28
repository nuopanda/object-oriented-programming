package edu.neu.ccs.cs5004.assignment5.problem1;

/**
 * Represents a PriorityQueue.
 */
public interface PriorityQueue {

  /**
   * Creates a new empty PriorityQueue.
   *
   * @return new empty PriorityQueue
   */
  static PriorityQueue createEmpty() {
    return new Empty();
  }

  /**
   * Add new node to PriorityQueue.
   *
   * @param priority -- new node's priority
   * @param value -- new node's value
   * @return -- new PriorityQueue
   */
  PriorityQueue add(Integer priority, String value);

  /**
   * Getter for property 'first'.
   *
   * @return ConsNode for property 'first'.
   */
  Node getFirst();

  /**
   * Getter for property 'rest'.
   *
   * @return ConsNode for property 'rest'.
   */
  PriorityQueue getRest();

  /**
   * Peek the head of the PriorityQueue.
   *
   * @return the head of the PriorityQueue
   * @throws Exception if the PriorityQueue is empty
   */
  String peek() throws Exception;

  /**
   * remove the head of the PriorityQueue.
   *
   * @return the new PriorityQueue
   * @throws Exception if the PriorityQueue is empty
   */
  PriorityQueue pop() throws Exception;

  /**
   * Check if the PriorityQueue is empty.
   *
   * @return if the PriorityQueue is empty.
   */
  Boolean isEmpty();

  /**
   * Check if two objects are equal.
   *
   * @param object-- to be checked object
   * @return boolean --if two objects are equal
   */
  boolean equals(Object object);

  /**
   * Get the hashCode of the PriorityQueue.
   *
   * @return hashCode
   */
  int hashCode();

  /**
   * Get the String of the PriorityQueue.
   *
   * @return the String of the PriorityQueue
   */
  String toString();
}
