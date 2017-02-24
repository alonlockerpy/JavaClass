
public class Lesson8Ext_Class_Child extends Lesson8Ext_Class_Father
{
	String Word;
	
	Lesson8Ext_Class_Child() 
	{
		Word = Language + " " + "Word";
	}
	
	public void print() 
	{
		System.out.println(Word);
	}
}
