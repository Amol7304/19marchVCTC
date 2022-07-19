package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args)
	{
		// to call mother non static property i need mother object
		
		
		Mother m = new Mother();//create object of mother class
		
		// to call child non static property i need child object
		
		Child c = new Child();//create childs object
		
		m.nature90();// calling mother property 
		Mother.care();//calling mothers property
		
		c.nature90();
		c.mobile();
		Child.laptop();
		//
		c.nature90();// by using child object we are using mother properties
		Child.care();// by using child class name calling mothers static properties
		Child.laptop();
		
	}

}
