package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class League with their details -name, startMonth, endMonth, gameNumber, nextGame.
 *
 * @author nikkiwang
 */
public class League implements ILeague {

  private String name;
  private int startMonth;
  private int endMonth;
  private int gameNumber;
  private Game nextGame;
  private Game thisGame;

  /**
   * Creat a league object.
   *
   * @param name -- league's name
   * @param startMonth -- league's start month
   * @param endMonth -- league's end month
   * @param gameNumber -- league's game number
   * @throws Exception if the month is not valid
   */
  public League(String name, int startMonth, int endMonth, int gameNumber)
      throws Exception {
    if (startMonth < 1 || startMonth > 12 || endMonth < 1 || endMonth > 12
        || startMonth > endMonth) {
      throw new IllegalArgumentException("invalid month.");
    }
    this.name = name;
    this.startMonth = startMonth;
    this.endMonth = endMonth;
    this.gameNumber = gameNumber;
    this.nextGame = null;
    this.thisGame = null;
  }

  /**
   * get league name.
   *
   * @return league name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Set next game.
   */
  @Override
  public void setNextGame(Game game) {
    this.nextGame = game;
  }

  /**
   * Get next game.
   *
   * @return nextGame.
   */
  @Override
  public Game getNextGame() {
    return this.nextGame;
  }

  /**
   * Get this game.
   *
   * @return thisGame.
   */
  @Override
  public Game getThisGame() {
    return this.thisGame;
  }

  /**
   * Compare Team.
   *
   * @return the winning team.
   */
  @Override
  public Team compareTeam(Team team1, Team team2) throws IllegalArgumentException {
    if (team1.getLeague() != team2.getLeague()) {
      throw new IllegalArgumentException("Not in the same league.");
    }
    int team1Point = team1.getPoints();
    int team2Point = team2.getPoints();
    if (team1Point == team2Point) {
      int team1WinNum = team1.getRecord().getWinNum();
      int team2WinNum = team2.getRecord().getWinNum();
      if (team1WinNum == team2WinNum) {
        throw new TiedTeamsException("Two teams are tied.");
      }
      return (team1WinNum > team2WinNum) ? team1 : team2;
    }
    return (team1Point > team2Point) ? team1 : team2;
  }

  /**
   * Schedule the next Game.
   */
  @Override
  public void scheduleGame(Game game, boolean seasonOn) throws IllegalArgumentException {
    this.setNextGame(game);
    this.nextGame.getHomeTeam().setSeasonOn(seasonOn);
    this.nextGame.getAwayTeam().setSeasonOn(seasonOn);
    this.nextGame.getAwayTeam().setGameRemaining(this.gameNumber);
    this.nextGame.getHomeTeam().setGameRemaining(this.gameNumber);
  }

  /**
   * Play the game, update all information.
   *
   * @param game -- game
   * @param homeTeamScore -- home team score
   * @param awayTeamScore -- away team score
   * @throws IllegalArgumentException if date is not within season
   */
  @Override
  public void playGame(Game game, int homeTeamScore, int awayTeamScore)
      throws IllegalArgumentException {
    if (game.getDate().getMonth() < this.startMonth || game.getDate().getMonth() > this.endMonth) {
      throw
          new IllegalArgumentException("invalid game date");
    }
    this.thisGame = game;
    this.thisGame.setPlayed(true, homeTeamScore, awayTeamScore);
    if (homeTeamScore > awayTeamScore) {
      this.thisGame.getHomeTeam().getRecord().addWinNum();
      this.thisGame.getAwayTeam().getRecord().addLossNum();
    } else if (homeTeamScore == awayTeamScore) {
      this.thisGame.getHomeTeam().getRecord().addTieNum();
      this.thisGame.getAwayTeam().getRecord().addTieNum();
    } else {
      this.thisGame.getAwayTeam().getRecord().addWinNum();
      this.thisGame.getHomeTeam().getRecord().addLossNum();
    }
  }
}

