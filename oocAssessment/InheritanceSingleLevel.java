//SINGLE LEVEL INHERITANCE

package oocAssessment;
class Parent//This is parent class
{
	void method1()//This is method of parent class
	{
		System.out.println("ABC is Father");
	}
}


public class InheritanceSingleLevel extends Parent{//Child class extending parent class
	void method2()//This is method of child class
	{
		
		System.out.println("abc is Child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****Single Level Inheritence****");
		InheritanceSingleLevel x = new InheritanceSingleLevel();//Object of class
		x.method1();
		x.method2();

	}

}

