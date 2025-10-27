package com.ak.cricket_player;

public class PlayerStatisticsApp {

	public static void main(String[] args) 
	{
		Player raj = new Player("rohit",120,740,90,550);
		System.out.println(raj.calculateAverage());
		System.out.println(raj.calculateStrikeRate());
//		System.out.println(raj);
	}

}
