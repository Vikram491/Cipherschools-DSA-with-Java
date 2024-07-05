class Car {
	 
 	String name;
 	String color;
 	int year;
 	int maxspeed;
 	void accelerate() {
 		System.out.println("Car is acceleraring");
 		
 	}

}

public class CarStudy {
 
 public static void main(String[]args) {
	 Car polo =new Car();
	 System.out.println(polo.name);
	 System.out.println(polo.color);
	 System.out.println(polo.year);
	 System.out.println(polo.maxspeed);
	 
	 polo.name ="polo";
	 polo.color="Red";
	 polo.year=2016;
	 polo.maxspeed=120;
	 
	 System.out.println(polo.name);
	 System.out.println(polo.color);
	 System.out.println(polo.year);
	 System.out.println(polo.maxspeed);
	 
	 
	 
	 
 }
}

// Control Flow

import java.util.*;
class Student{
	String name;
	int marks;
	boolean checkPass()
	{
		//if(marks>40{
		//return true;
	//}
		//	else 
	{
		// return false;
		
	}
	
	if(marks>40) return true;
	return false;
	}
}

public class ControlFlow{
	
	
	int findMax(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
		else {
			if(b>c)
			{
				return b;
			}
			else {
				return c;
			}
		}
	}
	
	
	
	public static void main(String[]args) {
		Student s1 =new Student();
		s1.name="Ram";
		s1.marks=80;
		
		Student s2=new Student();
		s2.name="Sham";
		s2.marks=30;
		
		System.out.println(s1.checkPass());
		System.out.println(s2.checkPass());
		
		
		ControlFlow cf=new ControlFlow();
		System.out.println(cf.findMax(10, 7, 15));
		
		char c='a';
		switch(c)
		{
		case 'a':
			System.out.println("Hi,I'm A");
			break;
		case 'b':
			System.out.println("Hi,I'm B");
			break;
		case 'c':
			System.out.println("Hi,I'm C");
			break;
		default:
			System.out.println("Hi,I'm Not A,B or C");
			
			
		}
		System.out.println("After switch");
		
		
	}
}
