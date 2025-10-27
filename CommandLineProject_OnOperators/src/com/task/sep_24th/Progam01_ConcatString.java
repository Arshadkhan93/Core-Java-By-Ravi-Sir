package com.task.sep_24th;

public class Progam01_ConcatString {
	public static void main(String[] args) {
		String sumString="";
		for(int i=0;i<args.length;i++)
		{
			sumString+=args[i]+" ";
		}
		System.out.println("Concatenated String : "+sumString);
	}
}
