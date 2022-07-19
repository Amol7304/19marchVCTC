package variable_types;

public class GlobalVariable {
	
  int a=10;//global non static variable
  static int b=90;//global static variable 
   
	public static void main(String[] args) 
	{
		 
	GlobalVariable gv= new GlobalVariable();//create object
	gv.test();//we can call static method
	test1();//calling static method
	System.out.println("value of a is "+gv.a);//calling non static global variable-->objectname.variable
	System.out.println("value of b is "+b);//calling  static global variable from same class-->variable name
	//call non static global variable from another class
	sample s= new sample();//create object of another class
	System.out.println("global non static variable from another class");
	//call static variable from another class
	System.out.println("global static variable from another class "+sample.q);
	
	int sub=800-gv.a;//using non static global variable from same class
	int sub1=900-b;//using static variable from same class
	
	int sub2=1000-s.p;//using non static varible from another class
	int sub3=3000-sample.q;//using static global variable from another class
	
	
	}
   public void test()
   {
	   int sum=a+10;//we cant call non static global variable
	   int sub=b-10;//we can call static global variable
	    
   }
   public static void test1()
{
	  // int sum=a+10;//we can call non-static global variable
	  int sub=b-10;//we can call non-static global variable
	  
}
   }
