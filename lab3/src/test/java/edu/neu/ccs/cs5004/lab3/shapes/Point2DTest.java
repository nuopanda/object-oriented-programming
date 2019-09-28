package edu.neu.ccs.cs5004.lab3.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Point2DTest {

  private Point2D point1;
  private Point2D point2;
  private Point2D point3;
  private Point2D point4;

  @Before
  public void setUp() throws Exception {
    this.point1 = new Point2D(5.0, 10.0);
    this.point2 = new Point2D(-5.0, 10.0);
    this.point3 = new Point2D(5.0, -10.0);
    this.point4 = new Point2D(-5.0, -10.0);

  }

  @Test
  public void distToOrigin() {
    assertEquals(11.180, this.point1.distToOrigin(), 0.001);
    assertEquals(11.180, this.point2.distToOrigin(), 0.001);
    assertEquals(11.180, this.point3.distToOrigin(), 0.001);
    assertEquals(11.180, this.point4.distToOrigin(), 0.001);
  }

  @Test
  public void getX() {
    assertEquals(5.0, this.point1.getX(), 0.001);
    assertEquals(-5.0, this.point2.getX(), 0.001);
    assertEquals(5.0, this.point3.getX(), 0.001);
    assertEquals(-5.0, this.point4.getX(), 0.001);
  }

  @Test
  public void getY() {
    assertEquals(10.0, this.point1.getY(), 0.001);
    assertEquals(10.0, this.point2.getY(), 0.001);
    assertEquals(-10.0, this.point3.getY(), 0.001);
    assertEquals(-10.0, this.point4.getY(), 0.001);
  }
}