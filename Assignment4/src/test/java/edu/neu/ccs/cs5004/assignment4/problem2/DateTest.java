package edu.neu.ccs.cs5004.assignment4.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {

  private Date date;

  @Before
  public void setUp() throws Exception {
    this.date = new Date(1, 3);
  }

  @Test
  public void testConstructor() throws Exception {
    try {
      Date date1 = new Date(-1, 3);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
    try {
      Date date1 = new Date(1, -3);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
    try {
      Date date1 = new Date(13, 3);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
    try {
      Date date1 = new Date(1, 32);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  public void getMonth() {
    assertEquals(1, this.date.getMonth());
  }

  @Test
  public void getDay() {
    assertEquals(3, this.date.getDay());
  }
}