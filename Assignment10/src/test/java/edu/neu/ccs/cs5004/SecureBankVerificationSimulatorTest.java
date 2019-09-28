package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class SecureBankVerificationSimulatorTest {

  private Map<Integer, List<MessageSignPair>> clientSignatureMap;
  private SecureBankVerificationSimulator simulator;

  @Before
  public void setUp() throws Exception {
    simulator = new SecureBankVerificationSimulator();
  }

  @Test
  public void parseCommandLine() {
    String[] args = {"1000", "20", "0.05", "record"};
    ParseResult parseResult = new ParseResult(1000, 20, 0.05, "record");
    assertEquals(parseResult, simulator.parseCommandLine(args));
    String[] args2 = {"1000", "20"};
    try {
      simulator.parseCommandLine(args2);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    String[] args3 = {"60000", "20", "0.05", "record"};
    try {
      simulator.parseCommandLine(args3);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    String[] args4 = {"600", "20000", "0.05", "record"};
    try {
      simulator.parseCommandLine(args4);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    String[] args5 = {"600", "20000", "-0.05", "record"};
    try {
      simulator.parseCommandLine(args5);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    String[] args6 = {"600", "20000", "1.05", "record"};
    try {
      simulator.parseCommandLine(args6);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void generateClient() {
    ParseResult parseResult = new ParseResult(10, 5, 0.05, "record");
    ClientInfoList clientInfoList = simulator.generateClient(parseResult);
    assertEquals(10, clientInfoList.getClientList().size());
    assertEquals(10, clientInfoList.getClientMap().size());
  }

  @Test
  public void generateClientSignatureMap() {
    ParseResult parseResult = new ParseResult(10, 5, 0.05, "record");
    Map<Integer, Client> clientMap = new HashMap<>();
    List<Integer> clientList = new ArrayList<>();
    ClientInfoList clientInfoList = new ClientInfoList(clientList, clientMap);
    try {
      simulator.generateClientSignatureMap(clientInfoList, parseResult);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    clientInfoList = simulator.generateClient(parseResult);
    Map<Integer, List<MessageSignPair>> clientSignatureMap = simulator
        .generateClientSignatureMap(clientInfoList, parseResult);
    assertNotEquals(0, clientSignatureMap.size());
  }

  @Test
  public void writeOutput() {
    ParseResult parseResult = new ParseResult(10, 5, 0.05, "record");
    ClientInfoList clientInfoList = simulator.generateClient(parseResult);
    Map<Integer, List<MessageSignPair>> clientSignatureMap = simulator
        .generateClientSignatureMap(clientInfoList, parseResult);
    simulator.writeOutput(parseResult, clientSignatureMap);
  }

  @Test
  public void testToString() {
    assertEquals("This is a Simulator", simulator.toString());

  }

  @Test
  public void hashCodeTest() throws Exception {
    assertEquals(-1325171055, this.simulator.hashCode());
  }

  @Test
  public void equalsItself() throws Exception {
    assertTrue(this.simulator.equals(this.simulator));
  }

  @Test
  public void notEquals() throws Exception {
    assertFalse(this.simulator.equals(new RsaPair()));
  }

  @Test
  public void notEqualsNull() throws Exception {
    assertFalse(this.simulator.equals(null));
  }

  @Test
  public void equals() throws Exception {
    assertTrue(this.simulator.equals(new SecureBankVerificationSimulator()));
  }

}