package edu.neu.ccs.cs5004.lab6.problem1;

public class TripReport {

  private Vehicle vehicle;
  private float speedPerMin;
  private float distance;
  private int duration;

  public TripReport(Vehicle vehicle, float speedPerMin, float distance, int duration) {
    this.distance = distance;
    this.vehicle = vehicle;
    this.speedPerMin = speedPerMin;
    this.duration = duration;
  }

  public Vehicle getVehicle() {
    return this.vehicle;
  }

  public float getSpeedPerMin() {
    return this.speedPerMin;
  }

  public float getDistance() {
    return this.distance;
  }

  public int getDuration() {
    return this.duration;
  }

}
