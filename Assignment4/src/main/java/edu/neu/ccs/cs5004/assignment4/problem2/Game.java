package edu.neu.ccs.cs5004.assignment4.problem2;

/** Class Game.
 * Represents a class Game with their details - homeTeam, awayTeam, date, homeTeamScore,
 * awayTeamScore, winningTeam, tieResult, tieGame and played.
 *
 * @author nikkiwang
 */
public class Game {

  private Team homeTeam;
  private Team awayTeam;
  private Date date;
  private int homeTeamScore;
  private int awayTeamScore;
  private Team winningTeam;
  private TieResult tieResult;
  private boolean tieGame;
  private boolean played;

  /**
   * Create a Game object.
   *
   * @param homeTeam --home Team
   * @param awayTeam -- away Team
   * @param date -- date (month, day)
   * @param tieGame -- if a tie game
   */
  public Game(Team homeTeam, Team awayTeam, Date date, boolean tieGame) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.date = date;
    this.homeTeamScore = 0;
    this.awayTeamScore = 0;
    this.tieGame = tieGame;
    this.winningTeam = null;
    this.played = false;
  }

  /**
   * Get homeTeam.
   *
   * @return homeTeam
   */
  public Team getHomeTeam() {
    return this.homeTeam;
  }

  /**
   * Get awayTeam.
   *
   * @return awayTeam.
   */
  public Team getAwayTeam() {
    return this.awayTeam;
  }

  /**
   * Get date.
   *
   * @return date.
   */
  public Date getDate() {
    return this.date;
  }

  /**
   * Get homeTeam score.
   *
   * @return homeTeamScore
   */
  public int getHomeTeamScore() {
    return this.homeTeamScore;
  }

  /**
   * Set homeTeam score.
   *
   * @param newScore -- new score
   */
  public void setHomeTeamScore(int newScore) {
    this.homeTeamScore = newScore;
  }

  /**
   * Get awayTeam score.
   *
   * @return awayTeamScore.
   */
  public int getAwayTeamScore() {
    return this.awayTeamScore;
  }

  /**
   * Set awayTeam score.
   *
   * @param newScore -- new score
   */
  public void setAwayTeamScore(int newScore) {
    this.awayTeamScore = newScore;
  }

  /**
   * Set winning team.
   *
   * @param winningTeam -- the winning team
   */
  public void setWinningTeam(Team winningTeam) {
    this.winningTeam = winningTeam;
  }

  /**
   * Set Tie result.
   *
   * @param tieResult -- the tie result
   */
  public void setTieResult(TieResult tieResult) {
    this.tieResult = tieResult;
  }

  /**
   * Set played game.
   *
   * @param played -- whether the game is played
   * @param newScore1 -- the score of homeTeam
   * @param newScore2 -- the score of awayTeam
   */
  public void setPlayed(boolean played, int newScore1, int newScore2) {
    this.played = played;
    this.setHomeTeamScore(newScore1);
    this.setAwayTeamScore(newScore2);
    if (this.tieGame) {
      if (newScore1 == newScore2) {
        this.setTieResult(TieResult.Tie);
      } else {
        this.setTieResult(TieResult.NotTie);
      }
    }
  }

  /**
   * Get Tie result.
   *
   * @return tieResult
   * @throws Exception if the game is not played or not a tieGame
   */
  public TieResult getTie() throws Exception {
    if (!played) {
      throw new FutureGameException("The game has not been played.");
    }
    if (!tieGame) {
      throw new IllegalArgumentException("Did not result in a tie.");
    }
    return this.tieResult;
  }


  /**
   * Get result.
   *
   * @return winningTeam.
   * @throws Exception if the game if not played or is a tieGame
   */
  public Team getResult() throws Exception {
    if (!played) {
      throw new FutureGameException("The game has not been played.");
    }
    if (tieGame) {
      throw new TiedGameException("Only can retrieve the tie.");
    }
    return this.winningTeam;
  }
}
