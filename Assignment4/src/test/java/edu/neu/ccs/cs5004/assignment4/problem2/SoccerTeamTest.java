package edu.neu.ccs.cs5004.assignment4.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoccerTeamTest {

  private SoccerTeam team1;
  private SoccerTeam team2;
  private League league;
  private Game game;
  private Date date;

  @Before
  public void setUp() throws Exception {
    this.date = new Date(2, 25);
    this.game = new Game(team1, team2, date, true);
    this.league = new League("Soccer Go", 1, 4, 10);
    this.team1 = new SoccerTeam("Seattle", league);
    this.team2 = new SoccerTeam("Boston", league);
  }

  @Test
  public void testGetName() {
    assertEquals("Seattle", this.team1.getName());
  }

  @Test
  public void testGetLeague() {
    assertEquals(league, this.team1.getLeague());
  }

  @Test
  public void testGetSeasonOn() {
    assertEquals(false, this.team1.isSeasonOn());
  }

  @Test
  public void testSetSeasonOn() {
    this.team1.setSeasonOn(true);
    assertEquals(true, this.team1.isSeasonOn());
  }

  @Test
  public void testAddGamePlayed() {
    this.team1.addGamePlayed();
    assertEquals(1, this.team1.getGamePlayed());
  }

  @Test
  public void testGetGamePlayed() {
    assertEquals(0, this.team1.getGamePlayed());
  }

  @Test
  public void testSetGameRemaining() {
    this.team1.setGameRemaining(15);
    assertEquals(15, this.team1.getGameRemaining());
  }

  @Test
  public void testReduceGameRemaining() throws Exception {
    try {
      this.team1.reduceGameRemaining();
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
    try {
      this.team1.setGameRemaining(15);
      this.team1.reduceGameRemaining();
      assertEquals(14, this.team1.getGameRemaining());
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown.");
    }
  }

  @Test
  public void testGetGameRemaining() {
    assertEquals(0, this.team1.getGameRemaining());
  }

  @Test
  public void testGetRecord() {
    assertTrue(0 == this.team1.getRecord().getLossNum());
    assertTrue(0 == this.team1.getRecord().getTieNum());
    assertTrue(0 == this.team1.getRecord().getWinNum());
  }

  @Test
  public void testSetLastGame() throws Exception {

    this.team1.setLastGame(game);
    assertEquals(game, this.team1.getLastGame());
  }

  @Test
  public void testGetLastGame() throws Exception {
    try {
      Game game = this.team1.getLastGame();
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    this.team1.setLastGame(game);
    assertEquals(game, this.team1.getLastGame());
  }

  @Test
  public void testGetPoints() {
    assertEquals(0, this.team1.getPoints());
  }

  @Test
  public void testPlayGame() throws Exception {
    this.team1.setGameRemaining(3);
    game.setHomeTeamScore(2);
    game.setAwayTeamScore(5);
    this.team1.playGame(game, true);
    assertEquals(game, this.team1.getLastGame());
    assertEquals(1, this.team1.getGamePlayed());
    assertEquals(2, this.team1.getGameRemaining());
    assertTrue(1 == this.team1.getRecord().getLossNum());
  }

}