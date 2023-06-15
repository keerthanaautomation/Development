package rail;

///over riding concept
//happens betn 2 class-parent and child
//when u have method in parent class that aslo having in child class
//same name and same num of paramater
//main method can't be over ridden

class AA{
	
	void show()
	{
		System.out.println("this is old show");
		
		
	}
	
	void display()
	{
		System.out.println("this is parent display method");
		
		
	}
	void add()
	{
		System.out.println("this is parent add method");
		
		
	}
	
}

class BB extends AA{
	
	void show()
	{
		System.out.println("this is new show");
		
		
	}
	
	void display()
	{
		System.out.println("this is child display method");
		
		
	}
	void mul()
	{
		System.out.println("this is child mul method");
		
		
	}
	
	
	
}




public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AA obj=new AA();
// obj.add();
// obj.display();
// obj.show();
 
 BB obj1=new BB();
 obj1.add();
 obj1.mul();
 obj1.display();

	}

}
