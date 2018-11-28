package com.bdogg.pong.model;

/**
 * Created by Brian on 4/8/2014.
 */
public class Game {
    private final int totalCups;

    private int totalCupsLeftTeam1;
    private int totalCupsLeftTeam2;

    private Team team1;
    private Team team2;

    public int getTotalCups() {
	return totalCups;
    }

    public int getTotalCupsLeftTeam1() {
	return totalCupsLeftTeam1;
    }

    public int getTotalCupsLeftTeam2() {
	return totalCupsLeftTeam2;
    }

    public Team getTeam1() {
	return team1;
    }

    public Team getTeam2() {
	return team2;
    }

    public Game(Team team1, Team team2, int numCups) {
	this.team1 = team1;
	this.team2 = team2;
	this.totalCups = numCups;
	this.totalCupsLeftTeam1 = numCups;
	this.totalCupsLeftTeam2 = numCups;
    }
}
