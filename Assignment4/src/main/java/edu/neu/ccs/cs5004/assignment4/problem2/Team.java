package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class Team with their details -name, league, seasonOn, gamePlayed,
 * gameRemaining,record, points, lastGame and WINPOINT.
 *
 * @author nikkiwang
 */
public class Team {

  protected String name;
  protected League league;
  protected boolean seasonOn = false;
  protected int gamePlayed = 0;
  protected int gameRemaining = 0;
  protected Record record = new Record();
  protected int points = 0;
  protected Game lastGame = null;
  protected static final int WIN_POINT = 1;

  /**
   * Create the constructor of Team.
   *
   * @param name --team's name
   * @param league -- team's league
   */
  public Team(String name, League league) {
    this.name = name;
    this.league = league;
  }

  /**
   * Get name.
   *
   * @return name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Get league.
   *
   * @return league.
   */
  public League getLeague() {
    return this.league;
  }

  /**
   * Get whether season On.
   *
   * @return seasonOn.
   */
  public boolean isSeasonOn() {
    return this.seasonOn;
  }

  /**
   * Set season On.
   *
   * @param seasonOn -- whether is on season
   */
  public void setSeasonOn(boolean seasonOn) {
    this.seasonOn = seasonOn;
  }

  /**
   * Add played game number.
   */
  public void addGamePlayed() {
    this.gamePlayed += 1;
  }

  /**
   * Get played game number.
   *
   * @return played game number.
   */
  public int getGamePlayed() {
    return this.gamePlayed;
  }

  /**
   * Set remaining game number.
   *
   * @param gameRemaining -- number of remaining game
   */
  public void setGameRemaining(int gameRemaining) throws IllegalArgumentException {
    this.gameRemaining = gameRemaining;
    if (this.gameRemaining < 0) {
      throw new IllegalArgumentException("invalid remaining number.");
    }
  }

  /**
   * Reduce remaining game number.
   */
  public void reduceGameRemaining() throws IllegalArgumentException {
    this.gameRemaining -= 1;
    if (this.gameRemaining < 0) {
      throw new IllegalArgumentException("invalid remaining number.");
    }
  }

  /**
   * Get remaining game number.
   *
   * @return remaining game.
   */
  public int getGameRemaining() {
    return this.gameRemaining;
  }

  /**
   * Get the record.
   *
   * @return record
   */
  public Record getRecord() {
    return this.record;
  }

  /**
   * Set the last game.
   *
   * @param game -- last game
   */
  public void setLastGame(Game game) {
    this.lastGame = game;
  }

  /**
   * Get the last game.
   *
   * @return lastgame
   * @throws Exception if lastGame is null
   */
  public Game getLastGame() throws Exception {
    if (this.lastGame == null) {
      throw new InvalidGameException("No last game played.");
    }
    return this.lastGame;
  }

  /**
   * Get the points.
   *
   * @return points
   */
  public int getPoints() {
    int winNum = this.record.getWinNum();
    this.points = winNum * WIN_POINT;
    return this.points;
  }

  /**
   * Play game, update information. update lastGame, gamePlayed, gameRemaining, record
   *
   * @param game -- played game
   * @param homeTeam -- whether the team is homeTeam
   */
  public void playGame(Game game, boolean homeTeam) {
    this.lastGame = game;
    this.gamePlayed += 1;
    this.gameRemaining -= 1;
    int homeTeamScore = game.getHomeTeamScore();
    int awayTeamScore = game.getAwayTeamScore();
    if (homeTeamScore == awayTeamScore) {
      this.getRecord().addTieNum();
    }
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
