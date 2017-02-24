
public class Lesson6_Ex1 
{

	public static void main(String[] args)
	{
		int a,result;
		a=7;
		result = a % 2 != 0 ? -1 : a;
		System.out.println("The number is: " + result);
		
		int i = 3;

		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		i *= 2;
		i -= 10;
		System.out.println(i);
	}

}
