/* File        : AbstractClass
 * Description : Write a java program to create an abstract class
                 named Shape that contains an empty method named
                 numberOfSides( ). Provide three classes named
                 Rectangle, Triangle and Hexagon such that each
                 one of the classes extends the class Shape. Each
                 one of the class- es contains only the method
                 numberOfSides( ) that shows the number of sides in
                 the given geometrical structures. 
                 
 * author      : Thomas varghese
 * version      : 1.0
 * Date        : 27/10/2023
 */
package lab;
import java.util.Scanner;

public class AbstractClass {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
     rectangle.numberOfSides();
     triangle.numberOfSides();
     hexagon.numberOfSides();
  }
  }

 abstract class Shapes{
	abstract public void numberOfSides();
		
  }
 
class Rectangle extends Shapes{
	public void numberOfSides() {
		System.out.println("The Number Of Sides Of The Rectangle = 4");
		
  }
  }

  class Triangle extends Shapes{
  public void numberOfSides() {
  System.out.println("The Number Of Sides Of The Triangle = 3");
	
}
}
  class Hexagon extends Shapes{
  public void numberOfSides() {
  System.out.println("The Number of Sides Of The Hexagon = 6");
		
  }
  }