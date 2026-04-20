package Day4;

public class matrimony {

	public static void main(String[] args)
	{
		String gender ="Female";
		int age=19;
		if(gender=="male")
		{
			if(age>=21)
			{
				System.out.println("You are eligible to get marry");
			}
			else
			{
				System.out.println("Please wait ");
			}
		}
		
		else
		{
			if(gender=="Female")
			{
				if(age>=18)
				{
					System.out.println("Eligible to get marry");
				}
				else
				{
					System.out.println("You may wait");
				}
			}
		}
	}
}
	    