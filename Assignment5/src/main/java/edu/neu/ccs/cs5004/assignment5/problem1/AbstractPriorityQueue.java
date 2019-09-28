package edu.neu.ccs.cs5004.assignment5.problem1;

public abstract class AbstractPriorityQueue implements PriorityQueue {

  @Override
  public PriorityQueue add(Integer priority, String value) {
    ConsNode node = new ConsNode(priority, value);
    return addHelper(node, this);

  }

  /**
   * Add helper function.
   *
   * @param node --ConsNode to be added
   * @param curr -- current PriorityQueue
   * @return PriorityQueue with added new node
   */
  public PriorityQueue addHelper(ConsNode node, PriorityQueue curr) {
    if (curr instanceof Empty) {
      return new Cons(node, null);
    }
    if (node.getPriority() > curr.getFirst().getPriority()) {
      return new Cons(node, curr);
    }
    return new Cons(curr.getFirst(), new Cons(node, curr.getRest()));
  }
}
