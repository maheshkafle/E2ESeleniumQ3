
public class Arrays {

	public static void main(String[] args) 
	{
		//Method 1: to create an Array
		int[] arr1 = new int[5];
		arr1[0]=3;
		arr1[1]=6;
		arr1[2]=9;
		arr1[3]=12;
		arr1[4]=15;
		
		//Method 2: to create an Array
		int[] arr2 = {1,2,3,4,5};
		
		//In order to print the array
		
		//For Loop
		System.out.println("----For Loop---");
		for(int i= 0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		//While Loop
		System.out.println("----While Loop---");
		int j=0;
		while(j<arr1.length)
		{
			System.out.println(arr1[j]);
			j++;
		}
		
		//Enhanced For Loop
		System.out.println("----Enhanced For Loop---");
		String[] names = {"Mahesh", "Madan", "Sakshyam"};
		
		for(String n:names)
		{
			System.out.println(n);
		}
	}

}
