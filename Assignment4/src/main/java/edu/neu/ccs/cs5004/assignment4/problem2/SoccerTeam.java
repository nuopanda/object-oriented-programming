package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class SoccerTeam as a subclass of Team with their details -name, league,
 * seasonOn, gamePlayed, gameRemaining,record, points, lastGame, WINPOINT, TIEPOINT and LOSSPOINT.
 *
 * @author nikkiwang
 */
public class SoccerTeam extends Team {

  private static final int WIN_POINT = 3;
  private static final int TIE_POINT = 1;
  private static final int LOSS_POINT = 0;

  /**
   * Create an SoccerTeam object.
   *
   * @param name -- team's name
   * @param league -- team's league
   */
  public SoccerTeam(String name, League league) {
    super(name, league);
  }

  /**
   * Get the points.
   *
   * @return points
   */
  @Override
  public int getPoints() {
    int winNum = this.record.getWinNum();
    int tieNum = this.record.getTieNum();
    int lossNum = this.record.getLossNum();
    this.points = winNum * WIN_POINT + tieNum * TIE_POINT + lossNum * LOSS_POINT;
    return this.points;
  }

}
