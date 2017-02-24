
public class MainProgramClass5 {

	public static void main(String[] args) 
	{
		Class5_T1 t1 = new Class5_T1();
		t1.Name = "Alon";
		t1.LastName = "Locker";
		t1.Age = 43;
		t1.myStringArry = "Java is a general purpose computer programming language";
		String myAge = t1.intToString(t1.Age);
		t1.addTo(t1.Name, t1.LastName);
		Boolean check = t1.compareString(myAge, t1.LastName);
		System.out.println("My check result: " + check);
		t1.arrayPrintValues();
		
		
		

	}

}
