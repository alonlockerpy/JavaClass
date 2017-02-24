
public class MainProgram
{
	public static void main(String[] args)
	{
		MobileDevice myDevice = new MobileDevice(10, 15);
		myDevice.PrintParameters();
		int ScreenHight = 10;
		int ScreenWidth = 15;
		int ScreenSize = myDevice.setArea(ScreenHight,ScreenWidth);
        System.out.println("My Mobile screen size is: " + ScreenSize);
		myDevice.PictureQuality(false);
		
	}

}
