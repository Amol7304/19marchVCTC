package inheritance;

public class HierachicalInheritance {

	public static void main(String[] args) 
	{
		
		Father f = new Father();
		
		Son s = new Son();
		
		Daughter d = new Daughter();
		
		
		f.emotion();
		
		s.emotion();
		s.bike(); 
		
		
		d.emotion();
		d.scooty(); 
		
		
	}

}
