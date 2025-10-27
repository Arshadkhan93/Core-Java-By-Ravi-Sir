package com.ak.oops;

public class FanInformation {

	public static void main(String[] args) {
		Fan fi = new Fan();
		fi.name="Bajaj";
		fi.coil="Copper";
		fi.wings=3;
		fi.getFanInfo();
		fi.switchOn();
		
	}

}
class Fan{
	String name;
	String coil;
	int wings;
	public void getFanInfo() {
		System.out.println("The Name of Fan is "+name+"\n The Coil used in it is "+coil+"\n It have "+wings+" Number of Wings");
	}
	public void switchOn() {
		System.out.println("The Fan is On");
	}
	public void switchOff() {
		System.out.println("The Fan is Off");
	}
}