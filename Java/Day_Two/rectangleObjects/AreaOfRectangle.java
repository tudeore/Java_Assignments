package rectangleObjects;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentDayFour.Employee;

public class AreaOfRectangle 
{
	RectangleObject rectangleOne = new RectangleObject() ;
	
	@Test
		public void AreaOfrectangleLengthAndWidthPositive () 
		{	
			rectangleOne.setLength(50);
			rectangleOne.setWidth(50);
			assertEquals(2500,rectangleOne.areaOfRectangle());
		}
	@Test
		public void AreaOfrectangleIfOneIsNegative () 
		{	
			rectangleOne.setLength(-50);
			rectangleOne.setWidth(50);
			assertEquals(0,rectangleOne.areaOfRectangle());
		}
	
	RectangleObject rectangleTwo = new RectangleObject() ;
	
	@Test
		public void AreaOfrectangleTwoBothArePositive () 
		{	
			rectangleTwo.setLength(50);
			rectangleTwo.setWidth(50);
			assertEquals(2500,rectangleTwo.areaOfRectangle());
		}
	
	@Test
		public void AreaOfrectangleTwoIfOneIsNegative () 
		{	
			rectangleTwo.setLength(-50);
			rectangleTwo.setWidth(50);
			assertEquals(0,rectangleTwo.areaOfRectangle());
		}
	
	RectangleObject rectangleArea = new RectangleObject() ;
	
	@Test
		public void AreaCheckRectangles () 
		{	
			assertEquals(true,rectangleArea.checkAreaOfRectangles(rectangleOne.areaOfRectangle(),rectangleTwo.areaOfRectangle()));
		}

	
	RectangleObject rectangleParimeter = new RectangleObject() ;
	
	@Test
		public void perimeterOfrectangleOne () 
		{	
			rectangleParimeter.setLength(30);
			rectangleParimeter.setWidth(30);
			assertEquals(120,rectangleParimeter.perimeterOfRectangle());
		}
	
	@Test
		public void perimeterOfrectangleTwo () 
		{	
			rectangleParimeter.setLength(30);
			rectangleParimeter.setWidth(40);
			assertEquals(140,rectangleParimeter.perimeterOfRectangle());
		}
	
}


