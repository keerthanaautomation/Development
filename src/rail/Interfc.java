package rail;

public class Interfc implements Face {

	

	@Override
	public void pannumber() {
		// TODO Auto-generated method stub
		System.out.println(" pan num is 8764647 ");
		
	}

	@Override
	
	public void aadharnumber() {
		System.out.println(" aadhaaaaar num is 45769898" );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfc v= new Interfc();
		v.aadharnumber();
		v.pannumber();

	}

}
