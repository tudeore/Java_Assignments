package rectangleObjects;

public class RectangleObject
{
	private static int width;
	private static int length;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
//////////////////////////*******************************************************///////////////////////////////	
	
	public static int areaOfRectangle()
	{
		if(length < 0 || width <0)
		return 0;
		return (length*width);
	}
	
	boolean  checkAreaOfRectangles (int areaOne,int areaTwo)
	{
		if(areaOne == areaTwo)
			return true;
			return false;
	}
	
	long perimeterOfRectangle()
		{
			return (2*( length + width ));
		}
}
