package edu.neu.ccs.cs5004.lab3.shapes;

/**
 * This class represents a circle.  It offers all the operations mandated by the Shape interface.
 */
public class Circle extends AbstractShape {

  private double radius;

  /**
   * Construct a circle object using the given center and radius.
   *
   * @param xcor x coordinate of the center of this circle
   * @param ycor y coordinate of the center of this circle
   * @param radius the radius of this circle
   */
  public Circle(double xcor, double ycor, double radius) throws InvalidRadiusException {
    //super(pin);
    //Point2D pin = new Point2D(x, y);
    super(new Point2D(xcor, ycor));
    //this.radius = radius;

    if (radius < 0) {
      throw new InvalidRadiusException("Radius has to be positive!");
    } else {
      this.radius = radius;
    }
  }

  /**
   * Construct a circle object with the given radius. It is centered at (0,0)
   * @param radius the radius of this circle
   */
  //public Circle(shapes.Point2D point2D, double radius) {
  //super(new shapes.Point2D(0, 0));
  //this.radius = radius;
  //if (radius < 0) {
  //  throw new InvalidRadiusException("Radius has to be positive!");
  //} else {
  //  this.radius = radius;
  //}
  //}

  /**
   * get area.
   *
   * @return the area of circle.
   */
  //@Override
  public double area() {
    //shapes.Point2D copyPoint = this.reference;
    //shapes.Point2D copyPoint2 = super.reference;
    return Math.PI * radius * radius;

  }

  /**
   * get perimeter.
   *
   * @return perimeter.
   */
  @Override
  public double perimeter() {
    try {
      return 2 * Math.PI * this.getRadius();
    } catch (InvalidRadiusException e) {
      System.err.println("Negative radius");
      return -10;
    }
  }

  /**
   * resize.
   *
   * @param factor factor of resizing
   * @return shape
   */
  @Override
  public Shape resize(double factor) {
    return new Circle(reference.getX(), reference.getY(), Math.sqrt(factor)
        * radius);
  }

  /**
   * move X. nothing.
   */
  @Override
  public void moveX(Integer xcor) {

  }

  /**
   * move Y. nothing
   */
  @Override
  public void moveY(Integer ycor) {

  }

  /**
   * toString.
   *
   * @return toString
   */
  public String toString() {
    return String.format("Circle: center (%.3f,%.3f) radius %.3f",
        this.reference.getX(), this.reference.getY(), this.radius);
  }

  /**
   * getRadius.
   *
   * @return radius
   */
  public double getRadius() throws InvalidRadiusException {
    if (radius < 0) {
      throw new InvalidRadiusException("This radius is somehow negative!");
    } else {
      return radius;
    }
  }
}
