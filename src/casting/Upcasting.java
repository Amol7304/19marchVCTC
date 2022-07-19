package casting;

public class Upcasting {

	public static void main(String[] args) 
	{
		
		Father f = new Father();
		Son s= new Son();
		
		
		f.bike();
		f.car();
		s.bike();
		s.car();
	    s.education();
	    
		Father f1= new Son();
		System.out.println("******************");
		f1.bike();
		f1.car();
		//f1.education--->sons individual property father can't take
	    System.out.println("******************");
		
		
		
	}
		
		
		
	

}
