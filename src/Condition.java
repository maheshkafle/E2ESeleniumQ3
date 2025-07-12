
public class Condition 
{

	public static void main(String[] args) 
	{
		//Print Multiple of 2 and remaining numbers too using condition in Java
		
		int[] numbers = {1,2,3,6,7,9,10,11,13, 16};
		
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]%2==0) 
			{
				System.out.println(numbers[i]+ " is multiple of 2");
			}
			
			else 
			{
				System.out.println(numbers[i]);
			}
		}
	}

}
