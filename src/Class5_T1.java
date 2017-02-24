
public class Class5_T1 
{
	String Name, LastName, myStringArry, my2DArrayline1, my2DArrayline2;
	int Age;
	
	public String intToString(int Age)
	{
		String myAge = Integer.toString(Age);
		System.out.println("My age in string: " + myAge);
		return myAge;
	}
	
	public void addTo(String n, String l)
	{
		String addNames = n.concat(l);
		System.out.println("My concat name:" + addNames);
		System.out.println("My upper case name: " + addNames.toUpperCase());
		System.out.println("My name length: " + addNames.length());
		
	}
	
	public Boolean compareString(String Age, String addNames)
	{
		return Age.equals(addNames);
	}
	
	public void arrayPrintValues()
	{
		String [] myArray = "Java, is, a, general, purpose, computer, programming, language".split(",");
		System.out.println("Last 3 words in the arry are:" + myArray[5] + myArray[6] + myArray[7]);
		
		String [][] my2DArrayline = new String [2][3];
		my2DArrayline [0][0] = "Moshe";
		my2DArrayline [0][1] = "22";
		my2DArrayline [0][2] = "Jerusalem";
		my2DArrayline [1][0] = "Joseph";
		my2DArrayline [1][1] = "45";
		my2DArrayline [1][2] = "London";
		System.out.println("Print 2D index arry location 0,2: " + my2DArrayline[0][2]);
	}	
}
