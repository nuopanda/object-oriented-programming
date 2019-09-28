package edu.neu.ccs.cs5004.lab3.shapes;

/**
 * This class represents a square.
 */
public class Square extends AbstractShape {

  private double side;

  /**
   * Construct a square object using the given xcor, ycor and side.
   *
   * @param xcor x coordinate of the lower-left corner of this square
   * @param ycor y coordinate of the lower-left corner of this square
   * @param side the length of side of this square
   */
  public Square(double xcor, double ycor, double side) throws IllegalArgumentException {
    super(new Point2D(xcor, ycor));
    if (side <= 0) {
      throw new IllegalArgumentException("invalid side");
    }
    this.side = side;
  }

  @Override
  public double area() {
    return this.side * this.side;
  }

  @Override
  public double perimeter() {
    return 4 * (this.side);
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    return new Square(
        this.reference.getX(),
        this.reference.getY(), sqrtFactor
        * this.side);
  }

  /**
   * to String.
   *
   * @return string
   */
  public String toString() {
    return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height "
        + "%.3f", this.reference.getX(), this.reference.getY(), this.side, this
        .side);
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
