package rail;

class AAA{
	
	 public void show()
	{
		System.out.println("this is old show");
		
		
	}
	
	 public void display()
	{
		System.out.println("this is parent display method");
		
		
	}
	public void add()
	{
		System.out.println("this is parent add method");
		
		
	}
	
}

class BBB extends AA{
	
	public void show()
	{
		System.out.println("this is new show");
		
		
	}
	
	public void display()
	{
		System.out.println("this is child display method");
		
		
	}
     public	void mul()
	{
		System.out.println("this is child mul method");
		
		
	}
	
	
	
}






public class Topcosting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// top casting
		//child class obj--ref by parent class var
		
		//AAA obj=new BBB();
		//obj.add();
		//obj.display();
		//
		//down costing
		
		//AAA obj1=(AAA)new BBB();
		
		//obj1.display();
		//obj1.show();
		
		
		
		

	}

}
