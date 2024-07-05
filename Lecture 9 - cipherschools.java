// WITHIN THE SAME CLASS

public class Students {
    int rollNo;
    String name;
    public static void main(String args[]){
        Students s1 = new Students();
        Students s2 = new Students();
        s1.name = "Ram";
        s1.rollNo = 67;
        s2.name = "Vikram";
        s2.rollNo = 28;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
    }
}
// OUTSIDE THE CLASS

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
// INHERITANCE

class Shape {
    double pi = 3.14;
    double getSquare(int r) {
        return r*r;
    }
}
class Circle extends Shape {
    void area(int r){
        System.out.println(pi*getSquare(r));
    }
    
}
public class Inheritancestudy {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.area(4);
    }
}
