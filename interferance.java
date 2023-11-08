package implementance;
import java.util.Scanner;

 public class interferance { 
	 public static void main(String[] args) {
		 
		 //Fish
		 
  Fish fish=new Fish();
  System.out.println(" FISH ");
  fish.setName("MIMI");
  System.out.println("This fish name is "+fish.getName());
  
  fish.eat();
  fish.walk();
  Fish fish2=new Fish();
  fish2.setName("MOMO");
   System.out.println("This fish name is "+fish2.getName());
   
   //cat
   
  Cat cat=new Cat();
  System.out.println("\n CAT ");
  cat.setName("FLUFFY");
  System.out.println("This fish name is "+cat.getName());
  

  cat.eat();
  cat.setName("MOOSE");
  Cat cat2=new Cat();
  cat2.setName("MOMO");
   System.out.println("This fish name is "+cat2.getName());
 
  
  
  Spider spider=new Spider();
  System.out.println("\n Spider ");
   spider.eat();
	 }
}

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}

public abstract void eat ();
public void walk() {
	System.out.println("This is animal walks on "+legs+"legs");
}
}

class Spider extends Animal{
	public Spider() {
		super(8);
	}
	public void eat() {
		System.out.println("The Spider is eating");
	}
}

interface Pet{
	String getName();
	void setName(String name);
	void play();
}

//cat

class Cat extends Animal implements Pet{
	private String name;
    public Cat(String name) {
	super(4); //All cats have 4 legs
	this . name=name;
	}
  Cat(){
	this(" ");
}

@Override
public void eat() {
	System.out.println("The cat is eating");
}

@Override
public void setName(String name) {
	this.name = name;
}

@Override
public String getName() {
	return this.name;
}
public void play() {
	System.out.println("The cat is playing");
}
}

 //fish 

class Fish extends Animal implements Pet{
	private String name;
    public Fish() {
	super(0); //All fish have 0 legs
	}


@Override
public void eat() {
	System.out.println("The fish eat plants ");
}
 
public void setName(String name) {
	this.name = name;
}

@Override
public String getName() {
	return this.name;
}
public void play() {
	System.out.println("The Fish is playing");
}

@Override
public void walk() {
	System.out.println("The Fish has no legs ");
}
}
