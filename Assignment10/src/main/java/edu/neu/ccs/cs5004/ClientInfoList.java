package edu.neu.ccs.cs5004;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The type Client info list.
 */
public class ClientInfoList {

  private List<Integer> clientList;
  private Map<Integer, Client> clientMap;

  /**
   * Instantiates a new Client info list.
   *
   * @param clientList the client list
   * @param clientMap the client map
   */
  public ClientInfoList(List<Integer> clientList, Map<Integer, Client> clientMap) {
    this.clientList = clientList;
    this.clientMap = clientMap;
  }

  /**
   * Gets client list.
   *
   * @return the client list
   */
  public List<Integer> getClientList() {
    return clientList;
  }

  /**
   * Gets client map.
   *
   * @return the client map
   */
  public Map<Integer, Client> getClientMap() {
    return clientMap;
  }

  @Override
  public String toString() {
    return "ClientInfoList{"
        + "clientList=" + clientList
        + ", clientMap=" + clientMap
        + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    ClientInfoList that = (ClientInfoList) obj;
    return Objects.equals(clientList, that.clientList)
        && Objects.equals(clientMap, that.clientMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientList, clientMap);
  }
}

