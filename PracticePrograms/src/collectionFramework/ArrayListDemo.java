package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		
		//Adding Data to Array List
		myList.add(100);
		myList.add(10.5);
		myList.add("Simon");
		myList.add('A');
		myList.add(100);
		myList.add(null);
		myList.add(true);
		myList.add(null);
		
		//Size of Arraylist
		System.out.println(myList.size());
		
		//Printing ArrayList
		System.out.println("Printing Data from ArrayList = " +myList);
		
		//Remove element from ArrayList
		System.out.println(myList.remove(4));
		
		//After Removing Printing ArrayList
		System.out.println("After Removing = " + myList);
		
		//Insert Element in ArrayList
		myList.add(0, "Martin");
		
		//After Inserting Printing Arraylist
		System.out.println("After Inserting = " + myList);
		
		//Modify element in ArrayList (Modify/Replace/Change)
		myList.set(0, "Martin Luther");
		
		//After Modify Printing ArrayList
		System.out.println("After Modift = " + myList);
		
		//Access Specific Element from ArrayList 
		System.out.println(myList.get(6)); //Here 6 is an index Number

	}

}
