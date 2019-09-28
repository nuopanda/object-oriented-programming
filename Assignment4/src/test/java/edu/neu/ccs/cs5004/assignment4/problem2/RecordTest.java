package edu.neu.ccs.cs5004.assignment4.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecordTest {

  private Record record;

  @Before
  public void setUp() throws Exception {
    this.record = new Record();
  }

  @Test
  public void getWinNum() {
    assertTrue(0 == this.record.getWinNum());
  }

  @Test
  public void addWinNum() {
    this.record.addWinNum();
    assertTrue(1 == this.record.getWinNum());
  }

  @Test
  public void setTieNum() {
    this.record.setTieNum(2);
    assertTrue(2 == this.record.getTieNum());
  }

  @Test
  public void getTieNum() {
    assertTrue(0 == this.record.getTieNum());
  }

  @Test
  public void addTieNum() {
    this.record.addTieNum();
    assertTrue(1 == this.record.getTieNum());
  }

  @Test
  public void getLossNum() {
    assertTrue(0 ==  this.record.getLossNum());
  }

  @Test
  public void addLossNum() {
    this.record.addLossNum();
    assertTrue(1 == this.record.getLossNum());

  }
}