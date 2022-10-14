//Abstract example

package oocAssessment;

abstract class Example//Abstract class named example
{
	abstract void m1();//abstract method named m1
	public void m2()//normal method named m2
	{
		int x = 99;
		System.out.println("This is M2 code");
		System.out.println("x:" + x);
	}
}

public class AbstractAssessment extends Example{//Child class(AbstractAssessment)extends parent class(Example)
	public void m1()//definition of abstract method
	{
		System.out.println("This is M1 code");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractAssessment x = new AbstractAssessment();//Object of class
		x.m1();
		x.m2();

	}

}
