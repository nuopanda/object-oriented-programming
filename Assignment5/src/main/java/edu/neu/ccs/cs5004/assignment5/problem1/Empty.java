package edu.neu.ccs.cs5004.assignment5.problem1;

/**
 * Represents an empty PriorityQueue.
 */
public class Empty extends AbstractPriorityQueue {

  public Empty() {

  }

  public Node getFirst() {
    return null;
  }

  public PriorityQueue getRest() {
    return null;
  }


  @Override
  public String peek() throws Exception {
    throw new InvalidPeekException("no element in empty priority queue");
  }

  @Override
  public PriorityQueue pop() throws Exception {
    throw new InvalidPopException("no element in empty priority queue");
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public String toString() {
    return "Empty{}";
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return 42;
  }

}
