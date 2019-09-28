package edu.neu.ccs.cs5004.assignment5.problem1;

import java.util.Objects;

/**
 * Represents a Node of at least one element.
 */
public class ConsNode implements Node {

  private Integer priority;
  private String value;

  /**
   * Create a new ConsNode with priority and value.
   *
   * @param priority -- the priority of the node
   * @param value -- the value of the node
   */
  public ConsNode(Integer priority, String value) {
    this.priority = priority;
    this.value = value;
  }

  @Override
  public Integer getPriority() {
    return this.priority;
  }

  @Override
  public String getValue() {
    return this.value;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    ConsNode consNode = (ConsNode) object;
    return Objects.equals(priority, consNode.priority)
        && Objects.equals(value, consNode.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, value);
  }

  @Override
  public String toString() {
    return "ConsNode{"
        + "priority=" + priority
        + ", value='" + value + '\''
        + '}';
  }
}
