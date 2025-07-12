import java.util.ArrayList;

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		//Advantage of using ArrayList over Arrays is that
		//1. Size is dynamic i.e we can add items inside ArrayList dynamically unlike in Array where length is fixed4
		//2. Also In Arrays total number of item is calculated by .length method while in ArrayList .size method gives total number of items in it.
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Mahesh");
		a.add("Ramesh");
		a.add("Umesh");
		a.add("Ravan");
		a.remove(3);
		
		System.out.println(a.get(0));
		
		//size method gives total number of items in ArrayList.
		System.out.println(a.size());
		
		//Enhanced for loop in ArrayList
		for(String name : a) 
		{
			System.out.println(name);
		}
		
		//To check if an item is present inside ArrayList, use .contains method
		System.out.println(a.contains("Mahesh"));

	}

}
