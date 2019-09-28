package edu.neu.ccs.cs5004.lab6.problem1;

public abstract class Vehicle {

  protected String ID;
  protected float avgSpeed;
  protected float maxSpeed;

  public Vehicle(String ID, float avgSpeed, float maxSpeed) {
    this.ID = ID;
    this.avgSpeed = avgSpeed;
    this.maxSpeed = maxSpeed;
  }

  public float getAvgSpeed() {
    return this.avgSpeed;
  }

  public float getMaxSpeed() {
    return this.maxSpeed;
  }
}
