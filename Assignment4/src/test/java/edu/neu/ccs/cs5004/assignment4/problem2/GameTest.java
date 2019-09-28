package edu.neu.ccs.cs5004.assignment4.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

  private AmericanFootballTeam team1;
  private AmericanFootballTeam team2;
  private BaseballTeam team3;
  private BaseballTeam team4;
  private League league1;
  private League league2;
  private Date date;
  private Game game;
  private Game game2;

  @Before
  public void setUp() throws Exception {
    this.team1 = new AmericanFootballTeam("Seattle", league1);
    this.team2 = new AmericanFootballTeam("Boston", league1);
    this.team3 = new BaseballTeam("Seattle", league2);
    this.team4 = new BaseballTeam("Boston", league2);
    this.date = new Date(2, 25);
    this.game = new Game(team1, team2, date, true);
    this.game2 = new Game(team3, team4, date, false);
    this.league1 = new League("Football Family", 1, 4, 10);
    this.league2 = new League("Baseball Union", 1, 4, 10);

  }

  @Test
  public void getHomeTeam() {
    assertEquals(team1, this.game.getHomeTeam());
  }

  @Test
  public void getAwayTeam() {
    assertEquals(team2, this.game.getAwayTeam());
  }

  @Test
  public void getDate() {
    assertEquals(date, this.game.getDate());
  }

  @Test
  public void getHomeTeamScore() {
    assertEquals(0, this.game.getHomeTeamScore());
  }

  @Test
  public void setHomeTeamScore() {
    this.game.setHomeTeamScore(10);
    assertEquals(10, this.game.getHomeTeamScore());
  }

  @Test
  public void getAwayTeamScore() {
    assertEquals(0, this.game.getAwayTeamScore());
  }

  @Test
  public void setAwayTeamScore() {
    this.game.setAwayTeamScore(8);
    assertEquals(8, this.game.getAwayTeamScore());
  }

  @Test
  public void setWinningTeam() throws Exception {
    this.game2.setPlayed(true, 5, 2);
    this.game2.setWinningTeam(team1);
    assertEquals(team1, this.game2.getResult());
  }

  @Test
  public void setTieResult() throws Exception {
    this.game.setPlayed(true, 5, 2);
    this.game.setTieResult(TieResult.Tie);
    assertEquals(TieResult.Tie, this.game.getTie());
  }

  @Test
  public void setPlayed() throws Exception {
    this.game.setPlayed(true, 5, 2);
    assertEquals(5, this.game.getHomeTeamScore());
    assertEquals(2, this.game.getAwayTeamScore());
    assertEquals(TieResult.NotTie, this.game.getTie());
  }

  @Test
  public void getTie() throws Exception {
    try {
      this.game.getTie();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      this.game2.getTie();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      this.game.setPlayed(true, 5, 2);
      assertEquals(TieResult.NotTie, this.game.getTie());
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      this.game2.setPlayed(true, 5, 2);
      this.game2.getTie();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void getResult() throws Exception {
    try {
      this.game.getResult();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      this.game2.getResult();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      this.game.setPlayed(true, 5, 2);
      this.game.getResult();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      this.game2.setPlayed(true, 5, 2);
      this.game2.getResult();
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
  }
}