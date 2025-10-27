package com.ak.cricket_player;

public class Player 
{
	private String name;
	private int noOfMatches;
	private int ballFaced;
	private int timesOut;
	private int runs;
	public Player(String name, int noOfMatches, int ballFaced, int timesOut, int runs) 
	{
		super();
		this.name = name;
		this.noOfMatches = noOfMatches;
		this.ballFaced = ballFaced;
		this.timesOut = timesOut;
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public int getBallFaced() {
		return ballFaced;
	}
	public int getTimesOut() {
		return timesOut;
	}
	public int getRuns() {
		return runs;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public void setBallFaced(int ballFaced) {
		this.ballFaced = ballFaced;
	}
	public void setTimesOut(int timesOut) {
		this.timesOut = timesOut;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public double calculateStrikeRate() 
	{
		System.out.println(this.ballFaced);
		double x=((double)this.runs/this.ballFaced)*100;
		System.out.println("Strike:"+x);
		return x;
	}
	public double calculateAverage() {
		double y = ((double)this.runs)/this.timesOut;
		System.out.println("ave:"+y);
		return y;
	}
	@Override
	public String toString() {
		return "Player Name : "+this.name+"\nMatches : "+this.noOfMatches+"\n"
				+ "Runs : "+this.runs+"\nBalls Faced : "+this.ballFaced+
				"\nTimes Out : "+this.timesOut+"\nAverage : "+this.calculateAverage()+
				"\n Rate : "+this.calculateStrikeRate();
	}
	
	

}
