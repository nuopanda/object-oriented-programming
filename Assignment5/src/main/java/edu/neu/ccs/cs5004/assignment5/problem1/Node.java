package edu.neu.ccs.cs5004.assignment5.problem1;

/**
 * Represents a node.
 */
public interface Node {

  /**
   * Creates a new empty Node.
   *
   * @return new empty node
   */
  static Node createEmptyNode() {
    return new EmptyNode();
  }

  /**
   * Get the priority of the node.
   *
   * @return priority of node.
   */
  Integer getPriority();

  /**
   * Get the value of the node.
   *
   * @return the value of node.
   */
  String getValue();


  /**
   * Check if two objects are equal.
   *
   * @param object-- to be checked object
   * @return boolean --if two objects are equal
   */
  boolean equals(Object object);

  /**
   * Get the hashCode of the Node.
   *
   * @return hashCode
   */
  int hashCode();

  /**
   * Get the String of the Node.
   *
   * @return the String of the Node
   */
  String toString();

}
