package javalab;

	import java.util.Scanner;

	 public class interFace { 
		 public static void main(String [] args){
				Scanner sc=new Scanner(System.in);
				Fish fish=new Fish();
				System.out.println("");
				System.out.println("FISH");
				fish.setName("Mimi");
				System.out.println("This fish's name is "+fish.getName());
				fish.eat();
				fish.walk();
				Fish fish2=new Fish();
				fish2.setName("Momo");
				System.out.println("This fish's name is "+fish2.getName());
				
				Cat cat=new Cat();
				System.out.println("");
				System.out.println("CAT");
				cat.setName("Fluffy");
				System.out.println("This cat's name is "+cat.getName());
				cat.walk();
				cat.eat();
				cat.setName("Moose");
				System.out.println("This cat's name is "+cat.getName());

			    Spider spider=new Spider();
			    System.out.println("");
				System.out.println("SPIDER");
				spider.eat();
				spider.walk();
				} 
			}
			abstract class Animal{
				 protected int legs;
				 protected Animal (int legs) {
					 this.legs=legs;
					  
				 }
				 public abstract void eat();
				 public void walk() {
					 System.out.println("This Animal walks on "+legs+ " legs");
				 }
			}
			class Spider extends Animal{	 
				public Spider(){
					super(8);//All Spiders have eight legs
				}
				@Override
				public void eat() {
					System.out.println("Spider eat insects");
				}
			}
			interface Pet{
				 String getName();
				 void setName (String name);
				 void play();
			}
			//CAT
			class Cat extends Animal implements Pet{
				private String name;
				public Cat(String name) {
					super(4);// All cats have 4 legs
					this.name=name;
				}
				Cat() {
					 this("");
				}
				@Override
				public void eat() {
					System.out.println("Cat eat fishes");
				}
				@Override
				public void setName(String name) {
					this.name=name;
					
				}
				@Override
				public String getName() {
					return this.name;
					
				}
				public void play() {
					System.out.println("The cat is playing");
					
				}
			}
			//FISH
			class Fish extends Animal implements Pet{
				private String name;
				public Fish() {
					super(0);// All fish have 0 legs
					
				}
				
				@Override
				public void setName(String name) {
					this.name=name;
				}
				public void play() {
					System.out.println("The fish is playing");
					
				}
				@Override
				public String getName() {
					return this.name;
				}
				@Override
				public void walk() {
					System.out.println("Fish has no legs");
				}
				@Override
				public void eat() {
					System.out.println("Fish eat plants");
				}
			}

			 