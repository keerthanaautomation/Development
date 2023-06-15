package rail;

class A{
	
	void display() {
		
		System.out.println("this is parent class display");
		
	}
	
void add() {
		
	System.out.println("this is parent class add");
		
	}
}

//child class
class B extends A{
	
void display() {
		
		System.out.println("this is child class display");
		
	}
	
void sub() {
		
	System.out.println("this is child class sub");
		
	}
	
	
	
}

public class Inheritence {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// from parent class
		A obj=new A();
		obj.display();
		obj.add();
		
		B obj1=new B();
		obj1.display();
		
		obj1.sub();

	}

}
