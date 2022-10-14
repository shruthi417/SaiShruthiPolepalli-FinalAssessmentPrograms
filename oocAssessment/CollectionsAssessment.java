//Assessment on Collections

package oocAssessment;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionsAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4 };//Array List with 5 elements
		
        Vector<Integer> v = new Vector();//Creating vector object
        Hashtable<Integer, String> h = new Hashtable();//Hash Table
        //Adding elements in vector
		v.addElement(2);
        v.addElement(2);
  
        h.put(1, "Hello All");//put data in hash table
        h.put(2, "How Are You");//put data in hash table
  
  
        System.out.println("element from array list" + arr[3]);
        System.out.println("element from vector " + v.elementAt(1));
        System.out.println("element 1 from hash table " + h.get(1));
        System.out.println("element 1 from hash table " + h.get(2));

	}

}
