package com.ak.functional_discount;
import module java.base;

public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 String all = upper+lower+digits+special;
		 
		 Random random=new Random();
		 Supplier<String> passwordSupplier= ()->{
			 String result="";
			 for(int i=1;i<=8;i++)
			 {
				 int index = random.nextInt(all.length());
				 result += all.charAt(index);
			 }
			 return result;
		 };
		 IO.println("Generated Password: "+passwordSupplier.get());
	}

}
