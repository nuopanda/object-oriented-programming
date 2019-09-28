package edu.neu.ccs.cs5004.assignment5.problem1;

import java.util.Objects;

/**
 * Represents a PriorityQueue of at least one element.
 */
public class Cons extends AbstractPriorityQueue {

  private Node first;
  private PriorityQueue rest;

  /**
   * create new Cons with first and rest.
   * @param first -- Node
   * @param rest -- PriorityQueue
   */
  public Cons(Node first, PriorityQueue rest) {

    this.first = first;
    this.rest = rest;
  }

  @Override
  public Node getFirst() {
    return this.first;
  }


  @Override
  public PriorityQueue getRest() {
    return this.rest;
  }


  @Override
  public String peek() throws InvalidPeekException {
    if (this.isEmpty()) {
      throw new InvalidPeekException("the priority queue is empty.");
    } else {
      return this.getFirst().getValue();
    }

  }

  @Override
  public PriorityQueue pop() throws InvalidPopException {
    if (this.isEmpty()) {
      throw new InvalidPopException("the priority queue is empty.");
    }
    return this.getRest();

  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Cons cons = (Cons) object;
    return Objects.equals(first, cons.first)
        && Objects.equals(rest, cons.rest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, rest);
  }

  @Override
  public String toString() {
    return "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
  }
}
