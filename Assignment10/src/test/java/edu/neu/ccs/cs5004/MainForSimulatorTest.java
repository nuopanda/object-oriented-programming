package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainForSimulatorTest {

  private MainForSimulator mainSystem;
  private String[] args;

  @Before
  public void setUp() throws Exception {
    mainSystem = new MainForSimulator();
    args = new String[]{"1000", "20", "0.05", "result"};
  }

  @Test
  public void main() {
    mainSystem.main(args);
  }

  @Test
  public void testToString() {
    assertEquals("This is the main entrance", mainSystem.toString());
  }

  @Test
  public void testHashCode() {
    assertEquals(-1814140294, mainSystem.hashCode());
  }

  @Test
  public void equalsItself() throws Exception {
    assertTrue(this.mainSystem.equals(this.mainSystem));
  }

  @Test
  public void notEqualsNull() throws Exception {
    assertFalse(this.mainSystem.equals(null));
  }

  @Test
  public void notEqualsAnotherClass() throws Exception {
    assertFalse(this.mainSystem.equals(new RsaPair()));
  }

  @Test
  public void equals() throws Exception {
    assertTrue(this.mainSystem.equals(new MainForSimulator()));
  }
}