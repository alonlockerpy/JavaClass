
public class Lesson7Ex1_Class 
{
	public static void main(String[] args) 
	{
		String [] test = {"alon","locker"};
		try
		{
			System.out.println(test[5]);
		}
		catch (Exception testError)
		{
			System.out.println("Out of bundery: " + testError);
		}
	}

}
