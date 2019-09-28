package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParseResultTest {

  private Integer clientNum;
  private Integer verificationNum;
  private Double invalidPercent;
  private String output;
  private ParseResult parseResult;
  private ParseResult parseResult2;
  private ParseResult parseResult3;
  private ParseResult parseResult4;

  @Before
  public void setUp() throws Exception {
    clientNum = 1000;
    verificationNum = 40;
    invalidPercent = 50.0;
    output = "record";
    parseResult = new ParseResult(clientNum, verificationNum, invalidPercent, output);
    parseResult2 = new ParseResult(2000, verificationNum, invalidPercent, output);
    parseResult3 = new ParseResult(clientNum, 100, invalidPercent, output);
    parseResult4 = new ParseResult(clientNum, verificationNum, invalidPercent, "result");
  }

  @Test
  public void getClientNum() {
    assertEquals(clientNum, parseResult.getClientNum());
  }

  @Test
  public void getVerificationNum() {
    assertEquals(verificationNum, parseResult.getVerificationNum());
  }

  @Test
  public void getInvalidPercent() {
    assertEquals(invalidPercent, parseResult.getInvalidPercent());
  }

  @Test
  public void getOutput() {
    assertEquals(output, parseResult.getOutput());
  }

  @Test
  public void testToString() {
    assertEquals("ParseResult{clientNum=1000, verificationNum=40, invalidPercent=50.0, output='record'}", parseResult.toString());
  }

  @Test
  public void equals() {
    assertTrue(parseResult.equals(parseResult));
    assertFalse(parseResult.equals(null));
    assertFalse(parseResult.equals(parseResult2));
    assertFalse(parseResult.equals(parseResult3));
    assertFalse(parseResult.equals(parseResult4));

  }

  @Test
  public void testHashCode() {
    assertEquals(parseResult.hashCode(), parseResult.hashCode());
    assertNotEquals(parseResult.hashCode(), parseResult2.hashCode());
    assertNotEquals(parseResult.hashCode(), parseResult3.hashCode());
    assertNotEquals(parseResult.hashCode(), parseResult4.hashCode());
  }
}