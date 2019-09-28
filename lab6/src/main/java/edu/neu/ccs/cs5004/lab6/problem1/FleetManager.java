package edu.neu.ccs.cs5004.lab6.problem1;

public class FleetManager {

  public FleetManager() {

  }

  TripReport drive(float distance, Vehicle vehicle) {
    float avgSpeed = vehicle.getAvgSpeed();
    int duration = (int) Math.round(distance / avgSpeed);
    TripReport report = new TripReport(vehicle, avgSpeed, distance, duration);
    return report;
  }

  TripReport drive2(float distance, float speed, Vehicle vehicle) {
    float avgSpeed;
    if (speed > vehicle.getMaxSpeed()) {
      avgSpeed = vehicle.getMaxSpeed();
    } else {
      avgSpeed = speed;
    }
    int duration = Math.round(distance / avgSpeed);
    TripReport report = new TripReport(vehicle, avgSpeed, distance, duration);
    return report;

  }

  TripReport drive3(float distance, float speed, int duration, Vehicle vehicle) {
    float avgSpeed;
    if (speed > vehicle.getMaxSpeed()) {
      avgSpeed = vehicle.getMaxSpeed();
    } else {
      avgSpeed = speed;
    }
    TripReport report = new TripReport(vehicle, avgSpeed, distance, duration);
    return report;
  }

  TripReport drive4(float distance, float speed, float maxSpeed, Vehicle vehicle) {
    float avgSpeed;
    if (speed > maxSpeed) {
      avgSpeed = maxSpeed;
    } else {
      avgSpeed = speed;
    }
    int duration = Math.round(distance / avgSpeed);
    TripReport report = new TripReport(vehicle, avgSpeed, distance, duration);
    return report;

  }

}
