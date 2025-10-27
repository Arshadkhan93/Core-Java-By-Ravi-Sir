package com.ak.oops;

public class SpeakerInfo {

	public static void main(String[] args) {
		Speaker s =  new Speaker();
		s.name="JBL";
		s.price=2999.0;
		s.maximumVolume="120Hz";
		s.getSpeakerInfo();

	}

}
class Speaker{
	String name;
	String maximumVolume;
	double price;
	public void getSpeakerInfo() {
		System.out.println("Speaker Name Is :"+name);
		System.out.println("Speaker Maximum Volume Is :"+maximumVolume);
		System.out.println("Speaker Price Is :"+price);
	}
	
}