package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class ClientInfoListTest {

  private ClientInfoList clientInfoList;
  private ClientInfoList clientInfoList2;
  private ClientInfoList clientInfoList3;
  private List<Integer> clientList;
  private List<Integer> clientList2;
  private Map<Integer, Client> clientMap;
  private Map<Integer, Client> clientMap2;
  private Integer identifyNum;
  private Key privateKey;
  private Key publicKey;
  private RsaPair pair;
  private Client client;

  @Before
  public void setUp() throws Exception {
    clientList = new ArrayList<>();
    clientMap = new HashMap<>();
    clientList.add(12300);
    identifyNum = 12345;
    privateKey = new Key(BigInteger.ONE, BigInteger.TEN);
    publicKey = new Key(BigInteger.TEN, BigInteger.TEN);
    pair = new RsaPair(privateKey, publicKey);
    client = new Client(identifyNum, pair);
    clientMap.put(12345, client);
    clientMap2 = new HashMap<>();
    clientList2 = new ArrayList<>();
    clientInfoList = new ClientInfoList(clientList, clientMap);
    clientInfoList2 = new ClientInfoList(clientList, clientMap2);
    clientInfoList3 = new ClientInfoList(clientList2, clientMap);

  }

  @Test
  public void getClientList() {
    assertEquals(clientList, clientInfoList.getClientList());
  }

  @Test
  public void getClientMap() {
    assertEquals(clientMap, clientInfoList.getClientMap());
  }

  @Test
  public void testToString() {
    assertEquals("ClientInfoList{clientList=[12300], clientMap={12345=Client{identifyNum=12345}}", clientInfoList.toString());
  }

  @Test
  public void equals() {
    assertTrue(clientInfoList.equals(clientInfoList));
    assertFalse(clientInfoList.equals(null));
    assertFalse(clientInfoList.equals(clientInfoList2));
    assertFalse(clientInfoList.equals(clientInfoList3));

  }

  @Test
  public void testHashCode() {
    assertEquals(clientInfoList.hashCode(), clientInfoList.hashCode());
    assertNotEquals(clientInfoList.hashCode(), clientInfoList2.hashCode());
  }
}