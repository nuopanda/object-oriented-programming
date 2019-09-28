package edu.neu.ccs.cs5004.assignment4.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueTest {

  private AmericanFootballTeam team1;
  private AmericanFootballTeam team2;
  private SoccerTeam team3;
  private SoccerTeam team4;
  private League league1;
  private League league2;
  private Date date;
  private Date date2;
  private Game game;
  private Game game2;
  private Game game3;

  @Before
  public void setUp() throws Exception {
    this.team1 = new AmericanFootballTeam("Seattle", league1);
    this.team2 = new AmericanFootballTeam("Boston", league1);
    this.team3 = new SoccerTeam("Seattle", league2);
    this.team4 = new SoccerTeam("Boston", league2);
    this.date = new Date(2, 25);
    this.date2 = new Date(4, 25);
    this.game = new Game(team1, team2, date, true);
    this.game2 = new Game(team3, team4, date, false);
    this.game3 = new Game(team1, team2, date2, true);
    this.league1 = new League("Football Family", 1, 4, 10);
    this.league2 = new League("Baseball Union", 1, 4, 10);

  }
  @Test
  public void testConstructor(){
    try{
      League league3 = new League("American Football", -1, 14, 10);
      fail("An exception should have been thrown.");
    }catch(Exception e){

    }
  }
  @Test
  public void testGetName() {
    assertEquals("Football Family", this.league1.getName());
  }

  @Test
  public void compareTeam() throws Exception {
    try {
      this.league1.compareTeam(team1, team4);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    this.team1.getRecord().addWinNum();
    assertEquals(team1, this.league1.compareTeam(team1, team2));
    this.team2.getRecord().setTieNum(3);
    assertEquals(team1, this.league1.compareTeam(team1, team2));
    this.team3.getRecord().addWinNum();
    this.team4.getRecord().setTieNum(3);
    assertEquals(team3, this.league1.compareTeam(team3, team4));
  }

  @Test
  public void testSetNextGame() {
    this.league1.setNextGame(game3);
    assertEquals(game3, this.league1.getNextGame());
  }

  @Test
  public void testGetNextGame() {
    assertEquals(null, this.league1.getNextGame());
  }

  @Test
  public void testGetThisGame() {
    assertEquals(null, this.league1.getThisGame());
  }

  @Test
  public void scheduleGame() {
    this.league1.scheduleGame(game3, true);
    assertEquals(game3, this.league1.getNextGame());
    assertEquals(true, this.league1.getNextGame().getHomeTeam().isSeasonOn());
    assertEquals(true, this.league1.getNextGame().getAwayTeam().isSeasonOn());
    assertEquals(10, this.league1.getNextGame().getAwayTeam().getGameRemaining());
    assertEquals(10, this.league1.getNextGame().getHomeTeam().getGameRemaining());
  }

  @Test
  public void playGame() throws Exception {
    try {
      Date date3 = new Date(5, 25);
      Game game4 = new Game(team1, team2, date3, true);
      this.league1.playGame(game4, 5, 2);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {

    }
    this.league1.playGame(game3, 5, 2);
    assertEquals(5, this.league1.getThisGame().getHomeTeamScore());
    assertEquals(2, this.league1.getThisGame().getAwayTeamScore());
    assertTrue(1 == this.league1.getThisGame().getHomeTeam().getRecord().getWinNum());
    assertTrue(1 == this.league1.getThisGame().getAwayTeam().getRecord().getLossNum());
    this.league1.playGame(game3, 2, 2);
    assertEquals(2, this.league1.getThisGame().getHomeTeamScore());
    assertEquals(2, this.league1.getThisGame().getAwayTeamScore());
    assertTrue(1 == this.league1.getThisGame().getHomeTeam().getRecord().getTieNum());
    assertTrue(1 == this.league1.getThisGame().getAwayTeam().getRecord().getTieNum());
    this.league1.playGame(game3, 1, 2);
    assertEquals(1, this.league1.getThisGame().getHomeTeamScore());
    assertEquals(2, this.league1.getThisGame().getAwayTeamScore());
    assertTrue(1 == this.league1.getThisGame().getHomeTeam().getRecord().getWinNum());
    assertTrue(1 == this.league1.getThisGame().getAwayTeam().getRecord().getWinNum());


  }
}
