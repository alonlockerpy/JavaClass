
public class MobileDevice 
{
	private String Audio,Visual,Ports,Controllers,Graphics;
	private int ScreenWidth,ScreenHight;
	private Boolean hasFlash = false;
	
	MobileDevice(int ScreenWidth, int ScreenHight)
	{
		this.ScreenWidth = ScreenWidth;
		this.ScreenHight = ScreenHight;
		System.out.println(this.ScreenHight + this.ScreenWidth);
	}
    
    public void PrintParameters()
    {
    	Audio = "speakers";
    	Visual = "screen";
        Ports = "usb";
        Controllers = "volume controllers";
        Graphics = "camera";
        
        System.out.println(Audio);
        System.out.println(Visual);
        System.out.println(Ports); 
        System.out.println(Controllers); 
        System.out.println(Graphics);
        System.out.println(hasFlash);
    }
    
    public int CalculateArea(int w, int h)
    {
        return ScreenWidth * ScreenHight;
    }
    
    public void PictureQuality(Boolean hasFlash)
    {
    	if(hasFlash)
    	{
    		System.out.println("Good Quality");
    	}
    	else
    	{
    		System.out.println("Bad Quality");
    	}
    }
    
    public int setArea(int h, int w)
    {
    	return CalculateArea(h,w);
    }
}
