package edu.neu.ccs.cs5004.lab3.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

  @Test
  public void testConstruct() {
    try {
      Square square1 = new Square(5.0, 10.0, 3.0);
    } catch (IllegalArgumentException e) {

    }

    try {
      Square square2 = new Square(5.0, 10.0, -3.0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      Square square3 = new Square(5.0, 10.0, 0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }

  }

}