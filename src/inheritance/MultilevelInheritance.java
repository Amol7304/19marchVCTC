package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args)
	{
		GrandMother gm = new GrandMother();
		gm.receipe();
		Mother m = new Mother();
		m.receipe();
		Mother.care();// calling static method
		
		Child c = new Child();
		c.receipe();//calling supermost class property using child's object
		c.nature90();// calling superclass property using child's object
		c.mobile();// calling own property 
		c.laptop();//calling own property
		
		 
		
		Child.stories();// calling supermost class property using child's classname
		Child.care();// calling superclass property using child's object
		Child.laptop();//calling own property
		
		
	}

}
