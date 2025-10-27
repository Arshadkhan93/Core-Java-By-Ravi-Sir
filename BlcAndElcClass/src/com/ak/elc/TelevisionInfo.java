package com.ak.elc;
import com.ak.blc.Television;
import java.util.Scanner;



public class TelevisionInfo {

	public static void main(String[] args) {
		Television tv= new Television();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter TV Name :");
		String tvname =sc.nextLine();
		System.out.print("Enter TV Price :");
		double tvPrice=Double.parseDouble(sc.nextLine());
		System.out.print("Enter TV Model :");
		int tvModel=Integer.parseInt(sc.nextLine());
		System.out.print("Enter TV OS :");
		String tvOs=sc.nextLine();
		tv.setTvData(tvname, tvPrice, tvModel, tvOs);
		tv.getTvData();
		sc.close();

	}

}
