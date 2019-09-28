package edu.neu.ccs.cs5004.assignment5.problem1;

/**
 * Represents an empty Node.
 */
public class EmptyNode implements Node {

  public EmptyNode() {

  }

  @Override
  public Integer getPriority() {
    return null;
  }

  @Override
  public String getValue() {
    return null;
  }

  @Override
  public String toString() {
    return "EmptyNode{}";
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
