package com.ak.hierarchical_inheritance;


import java.util.*;
public class TesterDayScholarHosteller{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice: ");
        int choice = Integer.parseInt(sc.nextLine());
   if(choice >2){
                System.out.println("Invalid Choice!");
                System.exit(0);

   }
   System.out.print("Enter the Id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the Name: ");
        String name =sc.nextLine();
        System.out.print("Enter the Exam Fee: ");
        double examFee =  Double.parseDouble(sc.nextLine());
        if(examFee<0){
            System.out.println("Exam Fee should be Positive.");
            System.exit(0);
        }
        else if(id<0){
            System.out.println("Id Should be positive.");
            System.exit(0);
        }
        // taking input
double totalAmount=0;
        switch(choice){
            case 1 ->{
            	System.out.print("Enter Transport Fee: ");
               double transportFee = Double.parseDouble(sc.nextLine());
               System.out.print("Enter Total Amount To Be Paid: ");
                totalAmount = Double.parseDouble(sc.nextLine());
                if(totalAmount<=0){
                    System.out.println("amount should be Positive");
                    System.exit(0);
                }
               
               DayScholar d = new DayScholar(id,name,examFee,transportFee);
               System.out.println(d.displayDetails());
               System.out.println(d.calculate(totalAmount));
                

            }
            case 2 -> {
            	System.out.print("Enter the Hostel Fee: ");
               double hostellFee = Double.parseDouble(sc.nextLine());
               System.out.print("Enter the Total Amount: ");
               
                totalAmount = Double.parseDouble(sc.nextLine());
                if(totalAmount<=0){
                    System.out.println("amount should be Positive.");
                    System.exit(0);
                }
               Hosteller  h = new Hosteller(id,name,examFee,hostellFee);
               System.out.println(h.displayDetails());
               System.out.println(h.cal(totalAmount));
               
            }
            default ->{
            }
        }
           // sc.close();

    } 
}
class Students{
protected int sId;
protected String name;
protected  double examFee;
  
  Students(int sId,String name,double examFee){
    this.sId=sId;
    this.name=name;
    this.examFee = examFee;
  }
  public String displayDetails(){
    return "";
  }
 public double  payFee(){
    return 0.0;
 }

public String toString(){
    return "";
}

}
class DayScholar extends Students{
    protected double transportFee;

    DayScholar(int sId,String name,double examFee,double transportFee){
        super(sId,name,examFee);
        
        this.transportFee = transportFee;

    }
    public String calculate(double amount){
      double sum = (examFee+transportFee)-amount;
      if(sum ==0){
        return "All Fees are clear";
      }
      else{
        return "Remaining amount to pay is: "+(sum);
      }
    }
    public String displayDetails(){
        return "DayScholar[TransportFee="+transportFee+",name="+name+",studentId="+sId+",examFee="+examFee+"]";
    }
}
class Hosteller extends Students{
   protected double hostellFee;
   Hosteller(int sId,String name,double examFee,double hostellFee){
    super(sId,name,examFee);
    this.hostellFee=hostellFee;
   }
   public String cal(double amount){
    double sum = (hostellFee+examFee)-amount;
    if(sum ==0){
       return "All Fees are clear";
    }
    else{
       return "Remaining amount to pay is: "+(sum);
    }
   }
   public String displayDetails(){
    return "Hosteller[HostelFee="+hostellFee+",name="+name+",studentId="+sId+",examFee="+examFee+"]";
   }
}