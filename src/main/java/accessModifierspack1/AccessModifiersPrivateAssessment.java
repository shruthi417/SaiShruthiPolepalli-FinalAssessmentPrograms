//Access Modifiers PRIVATE class

package accessModifierspack1;
class AExample{  
	private String name = "Shruthi";  
	private void message()
	{
		System.out.println("My name is Shruthi");
	}  
}  

public class AccessModifiersPrivateAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AExample obj=new AExample();  
		   //System.out.println(obj.name);//Compile Time Error  
		   //obj.message();//Compile Time Error
		

	}

}
