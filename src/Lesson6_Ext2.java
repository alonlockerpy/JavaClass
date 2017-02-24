import javax.swing.text.AbstractDocument.BranchElement;

public class Lesson6_Ext2 
{

	public static void main(String[] args) 
	{	
		System.out.println("1:");
		String [] Countrys = "Austria,Germany,Canada,Peru,Israel".split(",");
		String first = Countrys[0];
		String state = Countrys[2];
		for(String Country : Countrys)
		{
			if(Country.equals("Israel"))
				System.out.println(Country);
			break;
		}

		if(state.equals("China"))
		{
			System.out.println("Yes we found it");
		}
		else
			System.out.println("No, Sorry");
		
		System.out.println(first.length());
	
		System.out.println("2:");
		int [] numbers = {15,2,36,20,7};
		int firstNum = numbers[0];
		int secondNum = numbers[1];
		int Total = 0;
		
		if (firstNum > secondNum)
		{
			System.out.println("Fist one is begger!");
		}
		else
		{
			System.out.println("Second one is begger!");
		}
		
		for(int number : numbers)
		{
			Total += number;
		}
		System.out.println("THe sum is: " + Total);
	
		int BigNum = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(BigNum < numbers[i])
			{
				BigNum = numbers[i];
			}
		}
		System.out.println("THe largest number is: " + BigNum);
		
		System.out.println("4:");
		int age = 55;
		
		if(age < 6)
			System.out.println("Kindergarten");
		else if (age >= 6 && age <= 18)
			System.out.println("Go to School");
		else if (age >= 19 && age <= 67)
			System.out.println("Go to Work");
		else if (age >= 67 && age < 120)
			System.out.println("Collecting Pension");
		else
			System.out.println("Age not found!");
	
		System.out.println("5:");
		String job = "Teacher";

		switch (job)
		{
		case "QA":
			System.out.println("15,000");
			break;
		case "Bank teller":
			System.out.println("10,000");
			break;
		case "Teacher":
			System.out.println("5,000");
			break;
		}
		
		System.out.println("6:");
		String [][] my2DArrayline = new String [2][3];
		my2DArrayline [0][0] = "Moshe";
		my2DArrayline [0][1] = "22";
		my2DArrayline [0][2] = "Jerusalem";
		my2DArrayline [1][0] = "Joseph";
		my2DArrayline [1][1] = "45";
		my2DArrayline [1][2] = "London";
		
		for(int a = 0 ; a <= 1 ; a++)
		{
			for(int d = 0 ; d <= 2 ; d++)
			{
					System.out.println(my2DArrayline[a][d]);
			}
		}
		
		System.out.println("7:");
		int [] Mumbers = {12,6,9,0,55,43};
		for(int num : Mumbers)
		{
			if((num % 2)== 0)
			{
				System.out.println(num);
			}
		}
		
		System.out.println("8:");
		String [] word = {"o","l","l","e","H"};
		int r = word.length;
		while ( --r >= 0 )
		{
			System.out.print(word[r]);
			
		}
		
		
			
			
		
		
			
		
	}

}
