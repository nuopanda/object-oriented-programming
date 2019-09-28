package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class BaseballTeam as a subclass of Team with their details -name, league, seasonOn,
 * gamePlayed, gameRemaining,record, points, lastGame and WINPOINT.
 *
 * @author nikkiwang
 */
public class BaseballTeam extends Team {

  /**
   * Create an BaseballTeam object.
   *
   * @param name -- team's name
   * @param league -- team's league
   */
  public BaseballTeam(String name, League league) {
    super(name, league);
    this.record.setTieNum(null);
  }

  /**
   * Play game, update information. update lastGame, gamePlayed, gameRemaining, record
   *
   * @param game --played game
   * @param homeTeam -- whether the team is homeTeam
   */
  @Override
  public void playGame(Game game, boolean homeTeam) {
    this.lastGame = game;
    this.gamePlayed += 1;
    this.gameRemaining -= 1;
    int homeTeamScore = game.getHomeTeamScore();
    int awayTeamScore = game.getAwayTeamScore();
    if (homeTeam) {
      if (homeTeamScore > awayTeamScore) {
        this.getRecord().addWinNum();
      } else if (homeTeamScore < awayTeamScore) {
        this.getRecord().addLossNum();
      }
    } else {
      if (homeTeamScore < awayTeamScore) {
        this.getRecord().addWinNum();
      } else if (homeTeamScore > awayTeamScore) {
        this.getRecord().addLossNum();
      }
    }
    this.getPoints();
  }
}
