//OVERLOADING ASSESSMENT

package oocAssessment;
class Adder{  //class named adder
	static int add(int a,int b)//method for addition of integer add with 2 parameters
	{
		return a+b;
	}  
	static int add(int a,int b,int c)//method for addition of integer add with 3 parameters
	{
		return a+b+c;
	}  
	String add(String a, String b)//method for combining two strings
	{
		return a + b;
	}
}  

public class OverloadingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder x = new Adder();//class object
		
		System.out.println(x.add(11,11));  
		System.out.println(x.add(11,11,11));
		System.out.println(x.add("Shruthi ", "Polepalli"));
		

	}

}
