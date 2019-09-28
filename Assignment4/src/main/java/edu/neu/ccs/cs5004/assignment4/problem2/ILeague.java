package edu.neu.ccs.cs5004.assignment4.problem2;

/* This interface contains all operations that League should support.
 */
public interface ILeague {

  /**
   * Set next game.
   *
   * @param game -- game
   */
  void setNextGame(Game game);

  /**
   * Get league name.
   *
   * @return name.
   */
  String getName();

  /**
   * Get next game.
   *
   * @return nextGame.
   */
  Game getNextGame();

  /**
   * Get this game.
   *
   * @return thisGame.
   */
  Game getThisGame();

  /**
   * Compare Team.
   *
   * @param team1 -- team1
   * @param team2 -- team2
   * @return the winning team.
   */
  Team compareTeam(Team team1, Team team2);

  /**
   * Schedule the next Game.
   *
   * @param game --game
   * @param seasonOn -- whether the season is on
   */
  void scheduleGame(Game game, boolean seasonOn);

  /**
   * Play the game, update all information.
   *
   * @param game -- game
   * @param homeTeamScore -- home team score
   * @param awayTeamScore -- away team score
   * @throws IllegalArgumentException if date is not within season
   */
  void playGame(Game game, int homeTeamScore, int awayTeamScore);
}
