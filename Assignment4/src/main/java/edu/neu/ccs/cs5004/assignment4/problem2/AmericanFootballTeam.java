package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class AmericanFootballTeam as a subclass of Team with their details -name, league,
 * seasonOn, gamePlayed, gameRemaining,record, points, lastGame and WINPOINT.
 *
 * @author nikkiwang
 */

public class AmericanFootballTeam extends Team {

  /**
   * Create an AmericanFootBallTeam object.
   *
   * @param name -- team's name
   * @param league -- team's league
   */
  public AmericanFootballTeam(String name, League league) {
    super(name, league);
  }
}


