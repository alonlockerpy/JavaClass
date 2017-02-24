import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson6_Ext3_Home 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> record = new ArrayList<>();
		File homedir = new File(System.getProperty("user.home"));
		File fileToRead = new File(homedir, "/test_home6.txt");
		try
		  {
				BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
				String line;
				while ((line = reader.readLine()) != null) 
				{
					record.add(line);
				}
				reader.close();
				for(String s : record)
				{
					System.out.println(s);
				}
				
				//Load the list into a hashSet
				  Set<String> set = new HashSet<String>(record);
				  if (set.contains("alon"))
				  {
				    System.out.println("Word found!");
				  }
				  else 
				  {
					  System.out.println("Word not found!");
				  }
				
				
					
				//record.forEach(s -> System.out.println(s));
		  }
		catch (Exception e)
		{
			System.out.println("ERROR: " +  e);
		}

		
	}

}
