package com.ak.elc;

import java.util.Scanner;

import com.ak.blc.Watch;

public class WatchInfo {

	public static void main(String[] args) {
		Watch boat = new Watch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Watch Name :");
		String watch = sc.nextLine();
		System.out.println("Enter Watch Price :");
		double price = Double.parseDouble(sc.nextLine());
		boat.setWatchData(watch, price);
		boat.getWatchData();
		sc.close();
		
	}

}
