package com.ak.hierarchical_inheritance;

import java.util.*;
public class EmployeeSystem{
    public static void main(String [ ] args){
           Scanner sc = new Scanner(System.in);
             
           System.out.print("Enter Permanent Employee Id: ");
            int emid = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Permanent Employee Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Permanent Employee Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if(salary<0){
                System.out.println("Error Invalid Input");
                System.exit(0);
            }
            
            PermenentEmployee p = new PermenentEmployee(emid,name,salary);
            System.out.println(p.toString());
            
            System.out.print("Enter Contract Employee Id: ");
            int id2 = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Contract Employee Name: ");
            String name2 = sc.nextLine();
            
            System.out.print("Enter Contract Employee Salary: ");
            double sala =Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter Contract Employee Duration: ");
            int dur = Integer.parseInt(sc.nextLine());

            ContractEmployee c = new ContractEmployee(id2,name2,sala,dur);
            System.out.println(c.toString());
            sc.close();            

    }
}
class Employee{
    protected int empId;
    protected String empName;
    protected double empSalary;

    Employee(int empId,String empName,double empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary = empSalary;
    }   
}
class PermenentEmployee extends Employee{
    protected double providedfund;
    PermenentEmployee(int empId,String empName,double empSalary){
        super(empId,empName,empSalary);
        this.providedfund =(empSalary*0.12);
    }
    public String toString(){
        return "PermanentEmployee [employeeId="+empId+", employeeName="+empName+", employeeSalary="+empSalary+", providentfund="+providedfund+"]"+"\n"+"Net Salary: "+(empSalary+providedfund);
    }

}
class ContractEmployee extends Employee{
    protected int conratctDuration;
    ContractEmployee(int empId,String empName,double empSalary,int conratctDuration){
        super(empId,empName,empSalary);
        this.conratctDuration=conratctDuration;

    }
    public String toString(){
        return "ContractEmployee [employeeId="+empId+", employeeName="+empName+", employeeSalary="+empSalary+", contractDuration="+conratctDuration+"]";
    }
}