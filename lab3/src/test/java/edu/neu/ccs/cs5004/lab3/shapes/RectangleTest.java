package edu.neu.ccs.cs5004.lab3.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

  @Test
  public void testConstructor() {
    try {
      Rectangle rectangle1 = new Rectangle(5.0, 10.0, 3.0, 7.0);
    } catch (IllegalArgumentException e) {

    }

    try {
      Rectangle rectangle1 = new Rectangle(5.0, 10.0, -3.0, 7.0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      Rectangle rectangle1 = new Rectangle(5.0, 10.0, 3.0, -7.0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      Rectangle rectangle1 = new Rectangle(5.0, 10.0, 0.0, 7.0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      Rectangle rectangle1 = new Rectangle(5.0, 10.0, -3.0, 0.0);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }
  }
}