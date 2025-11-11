package com.ak.multilevelinheritance;

import java.util.*;
public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice (1-3)");
        int choice=Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
            {
                Animal1 animal=new Animal1();
                animal.eat();
                break;
            }
            case 2:
            {
                Mammal1 mammal=new Mammal1();
                mammal.walk();
                break;
            }
            case 3:
            {
                Dog1 dog = new Dog1();
                dog.bark();
                break;
            }
            default :{
                System.out.print("Invalid choice!");
            }
            sc.close();
        }
    }
}
class Animal1
{
    public void eat()
    {
        System.out.print("Animal is eating");
    }
}
class Mammal1 extends Animal1
{
    public void walk()
    {
        System.out.print("Mammal is walking");
    }
}
class Dog1 extends Mammal1
{
    public void bark()
    {
        System.out.print("Dog is barking");
    }
}