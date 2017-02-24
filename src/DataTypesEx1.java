
public class DataTypesEx1 
{
	static int Age = 40;
	static char Name = 'A';
	static double Grade = 85.5;
	static int FixGrade = (int)Grade;
	static boolean Gender = false;
	
	public static void main(String[] args) 
	{
		Gender = true;
		System.out.println(Gender);
		System.out.println("My first latten name is: " + Name + " i am " + Age);
		System.out.println("My avrige grade is " + Grade);
		System.out.println("My fix grade is " + FixGrade);

	}

}
