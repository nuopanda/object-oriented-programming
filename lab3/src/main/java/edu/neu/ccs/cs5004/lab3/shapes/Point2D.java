package edu.neu.ccs.cs5004.lab3.shapes;

/**
 * This class represents a 2D point. This point is denoted in Cartesian coordinates as (x,y).
 */
public class Point2D {

  private double xcor;
  private double ycor;

  /**
   * Construct a 2d point with the given coordinates.
   *
   * @param xcor the x-coordinate of this point
   * @param ycor the y-coordinate of this point
   */
  public Point2D(double xcor, double ycor) {
    this.xcor = xcor;
    this.ycor = ycor;
  }

  /**
   * Compute and return the Euclidean distance of this point to the origin.
   *
   * @return the euclidean distance
   */

  public double distToOrigin() {
    return Math.sqrt(xcor * xcor + ycor * ycor);
  }

  /**
   * Return the x-coordinate of this point.
   *
   * @return x-coordinate of this point
   */
  public double getX() {
    return xcor;
  }

  /**
   * Return the y-coordinate of this point.
   *
   * @return y-coordinate of this point
   */
  public double getY() {
    return ycor;
  }
}