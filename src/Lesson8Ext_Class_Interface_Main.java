
public class Lesson8Ext_Class_Interface_Main 
{
	public static void main(String[] args) 
	{
		Lesson8Ext_Class_Israel il = new Lesson8Ext_Class_Israel();
		Lesson8Ext_Class_USA us = new Lesson8Ext_Class_USA();
		Lesson8Ext_Class_China ch = new Lesson8Ext_Class_China();
		
		System.out.println(il.myTraditionalFood());
		System.out.println(il.myTraditionalVacation());
		System.out.println(il.myTraditionalLanguage());
		
		System.out.println(us.myTraditionalFood());
		System.out.println(us.myTraditionalVacation());
		System.out.println(us.myTraditionalLanguage());
		
		System.out.println(ch.myTraditionalFood());
		System.out.println(ch.myTraditionalVacation());
		System.out.println(ch.myTraditionalLanguage());

	}

}
