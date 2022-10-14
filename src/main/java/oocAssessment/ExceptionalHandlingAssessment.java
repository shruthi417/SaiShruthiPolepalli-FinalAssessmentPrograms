//Assessment on Exceptional Handling

package oocAssessment;

public class ExceptionalHandlingAssessment {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TRY block
		try
		{
			int b = 2022/0;//divide by zero
		}
		//CATCH block
		catch(Exception e)
		{ 
			System.out.println("This is Exception Code");
		}

	}

}
