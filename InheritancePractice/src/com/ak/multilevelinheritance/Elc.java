package com.ak.multilevelinheritance;

import java.util.*;
public class Elc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        Dog dog = new Dog(sc.next(),Boolean.parseBoolean(sc.next()),sc.next());
        sc.close();
        System.out.print(dog);


    }
}
class Animal
{
    private String name;
    Animal(String name)
    {
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
class Mammal extends Animal
{
    private boolean hasFur;
    Mammal(String name,boolean hasFur)
    {
        // setName(name);
        super(name);
        this.hasFur=hasFur;
    }
    public void sethasFur(boolean hasFur)
    {
        this.hasFur=hasFur;
    }
    public boolean gethasFur()
    {
        return hasFur;
    }
}
class Dog extends Mammal
{
    private String breed;
    Dog(String name,boolean hasFur,String breed)
    {
        // setName(name);
        // sethasFur(hasFur);
        super(name,hasFur);
        this.breed=breed;
    }
    public void setBreed(String breed)
    {
        this.breed=breed;
    }
    public String getBreed()
    {
        return breed;
    }
    @Override
    public String toString()
    {
        return "Dog [getName()="+getName()+", isHasFur()="+gethasFur()+", breed="+getBreed()+"]";
    }
}
