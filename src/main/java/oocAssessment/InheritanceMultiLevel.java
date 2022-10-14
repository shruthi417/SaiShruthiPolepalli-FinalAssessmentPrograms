//MULTILEVEL INHERITANCE 

package oocAssessment;


class GrandFather//Main Grand parent Class
{
	void method1()
	{
		System.out.println("ABC is Grand Father");
	}
}
class Father extends GrandFather//Father class extending grand parent class
{
	void method2()
	{
		System.out.println("XYZ is Father");
	}
}

public class InheritanceMultiLevel extends Father {//class extending parent class
	void method3()
	{
		System.out.println("PQR is Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****MULTI LEVEL INHERITENCE****");
		InheritanceMultiLevel x = new InheritanceMultiLevel();//Object for class
		x.method1();
		x.method2();
		x.method3();

	}

}
