
public class StringsExample {

	public static void main(String[] args) 
	{
		String s = "Mahesh Kafle Academy";
	 
		String[] splittedString = s.split("Kafle");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println("***After trimming***");
		System.out.println(splittedString[1].trim());
		
		//Printing each characters in a String
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}

	}

}
