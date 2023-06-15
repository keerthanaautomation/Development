package rail;

public class Classandobj {///class name

	///class--called user defined(blue print or template)
	//contains
	//1.Data members--//	a.class var b.local var c.static var
	//2.methods
	//3.static data
	//4.constructor
	///data members//
	                                                                                                                                       
	
////////////1 st////////////////
	int bb=44;
	int cc=34;
	int dd=bb+cc;
	
	
	public void add() {
		System.out.println(dd);	
		
	}
	
////////////1 st////////////////
	
	
	public void addition() {
		
		
		int a=23;
		int b=34;
		int c=a+b;
		System.out.println(c);
	}
	
	static int addtn() {
		int j=4;
		int g=7;
		int r=j+g;
		return r;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class object=new class name()(;
		Classandobj obj=new Classandobj();
		
		obj.addition();
		
		
		////new//
		Classandobj obj2=new Classandobj();
		obj2.add();
		
		
		//Classandobj obj5=new Classandobj();
		//obj5.add1`tn()	;
	}

}
	
	
	
	
	
	
	
