import java.util.Scanner;
interface Area{
	double getArea();
}
interface Volume{
	double getVolume();
}
class Shape{
	String name;
	public Shape(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}

class Circle extends Shape implements Area{

	double radius;
	public Circle(double radius){
		super("Circle");
		this.radius=radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
}
class Square extends Shape implements Area{
	double side;
	public Square(double side){
		super("Square");
		this.side=side;
	}
	public double getArea(){
		return side*side;
	}
}		
class Cube extends Square implements Volume{
	public Cube(double side){
		super(side);
		this.name="Cube";
	}
	public double getVolume(){
		return side*side*side;
	}
}
class Sphere extends Circle implements Volume{
	
	public Sphere(double radius){
		super(radius);
		this.name="Sphere";
	}
	public double getVolume(){
		return (4.0/3.0)*Math.PI*radius*radius*radius;
	}
}
class Cylinder extends Circle implements Volume{
	double height;
	public Cylinder(double radius,double height){
		super(radius);	
		this.name="Cylinder";
		this.height=height;
		}
	public double getVolume(){
		return Math.PI*radius*radius*height;
	}
}
class Glome extends Circle implements Volume{
	
	public Glome(double radius){
		super(radius);
		this.name="Glome";
	}
	public double getVolume(){
		return 0.5*Math.PI*Math.PI*radius*radius*radius*radius;
	}
}

public class Names2{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	double radius,side,height;
	
	System.out.println("Enter radius:");
	radius=sc.nextDouble();
	Circle circle=new Circle(radius);
	System.out.println(circle.getName() + "Area is:" + circle.getArea());
	
	System.out.println("Enter side:");
	side=sc.nextDouble();
	Square square=new Square(side);
	System.out.println(square.getName() + "Area is:" + square.getArea());

	System.out.println("Enter side:");
	side=sc.nextDouble();
	Cube cube=new Cube(side);
	System.out.println(cube.getName() + "Volume is:" + cube.getVolume());	
	
	System.out.println("Enter radius:");
	radius=sc.nextDouble();
	Sphere sphere=new Sphere(radius);
	System.out.println(sphere.getName() +  "Volume is:" + sphere.getVolume());
	
	System.out.println("Enter radius and height:");
	radius=sc.nextDouble();
	height=sc.nextDouble();
	Cylinder cylinder=new Cylinder(radius,height);
	System.out.println(cylinder.getName() + "Volume is:" + cylinder.getVolume());
	
	System.out.println("Enter radius:");
	radius=sc.nextDouble();
	Glome glome=new Glome(radius);
	System.out.println(glome.getName() + "Volume is:" + glome.getVolume());
}
}

	
	
