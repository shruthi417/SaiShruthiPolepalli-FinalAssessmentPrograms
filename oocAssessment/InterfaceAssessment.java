//INTERFACE ASSESSMENT

package oocAssessment;



interface interface1//Interface named interface1
{
	//interface methods method1 and method2
	void method1();
	void method2();
	
	
}

public class InterfaceAssessment implements interface1 {//interface implementing interface1
	public void method1()//def of method1
	{
		System.out.println("This is code of Method 1");
	}
	public void method2()//def of method2
	{
		System.out.println("This is code of Method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceAssessment x = new InterfaceAssessment();//interface object
		x.method1();
		x.method2();

	}

}
