//OVERRIDING ASSESSMENT

package oocAssessment;



class ABC//class named ABC
{
	void alphabets()//method named alphabets in main class
	{
		System.out.println("A to Z are Alphabets");
	}
}

public class OverrideAssessment extends ABC{//class extending class
	void alphabets()//method overriding
	{
		super.alphabets();
		System.out.println("A-E-I-O-U are vovels and remaining are Consonants");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideAssessment x = new OverrideAssessment();//class object
		
		x.alphabets();//method calling

	}

}
