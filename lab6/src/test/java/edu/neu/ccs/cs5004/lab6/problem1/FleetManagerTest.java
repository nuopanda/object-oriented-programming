package edu.neu.ccs.cs5004.lab6.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FleetManagerTest {

  private Bus bus;
  private FleetManager manager;
  private TripReport testReport;

  @Before
  public void setUp() throws Exception {
    manager = new FleetManager();
    bus = new Bus("A1322", (float) 30, (float) 60);
    testReport = new TripReport(bus, (float) 30, (float) 120, (int) 4);
  }

  @Test
  public void testDrive() {
    TripReport report = manager.drive(120, bus);
    assertEquals(testReport.getVehicle(), report.getVehicle());
    assertEquals(testReport.getDistance(), report.getDistance(), 1);
    assertEquals(testReport.getSpeedPerMin(), report.getSpeedPerMin(), 1);
    assertEquals(testReport.getDuration(), report.getDuration());

  }

  @Test
  public void testDrive2() {
    TripReport report = manager.drive2((float) 120, (float) 30, bus);
    assertEquals(testReport.getVehicle(), report.getVehicle());
    assertEquals(testReport.getDistance(), report.getDistance(), 1);
    assertEquals(testReport.getSpeedPerMin(), report.getSpeedPerMin(), 1);
    assertEquals(testReport.getDuration(), report.getDuration());
  }

  @Test
  public void testDrive3() {
    TripReport report = manager.drive3((float) 120, (float) 30, 4, bus);
    assertEquals(testReport.getVehicle(), report.getVehicle());
    assertEquals(testReport.getDistance(), report.getDistance(), 1);
    assertEquals(testReport.getSpeedPerMin(), report.getSpeedPerMin(), 1);
    assertEquals(testReport.getDuration(), report.getDuration());
  }

  @Test
  public void testDrive4() {
    TripReport report = manager.drive4((float) 120, (float) 30, (float) 60, bus);
    assertEquals(testReport.getVehicle(), report.getVehicle());
    assertEquals(testReport.getDistance(), report.getDistance(), 1);
    assertEquals(testReport.getSpeedPerMin(), report.getSpeedPerMin(), 1);
    assertEquals(testReport.getDuration(), report.getDuration());
  }


}