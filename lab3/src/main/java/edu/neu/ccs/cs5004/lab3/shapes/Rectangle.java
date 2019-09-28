package edu.neu.ccs.cs5004.lab3.shapes;

/**
 * This class represents a rectangle.  It defines all the operations mandated by the Shape
 * interface
 */
public class Rectangle extends AbstractShape {

  private double width;
  private double height;

  /**
   * Constructs a rectangle object with the given location of its lower-left corner and dimensions.
   *
   * @param xcor x coordinate of the lower-left corner of this rectangle
   * @param ycor y coordinate of the lower-left corner of this rectangle
   * @param width width of this rectangle
   * @param height height of this rectangle
   */
  public Rectangle(double xcor, double ycor, double width, double height)
      throws IllegalArgumentException {
    super(new Point2D(xcor, ycor));
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("invalid height or width");
    }
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return this.width * this.height;
  }

  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    return new Rectangle(
        this.reference.getX(),
        this.reference.getY(), sqrtFactor
        * this.width, sqrtFactor * this.height);
  }

  /**
   * to String.
   *
   * @return string
   */
  public String toString() {
    return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height "
        + "%.3f", this.reference.getX(), this.reference.getY(), this.width, this
        .height);
  }

  /**
   * move X. nothing
   */
  @Override
  public void moveX(Integer xcor) {
    return;
  }

  /**
   * move Y. nothing
   */
  @Override
  public void moveY(Integer ycor) {
    return;
  }
}