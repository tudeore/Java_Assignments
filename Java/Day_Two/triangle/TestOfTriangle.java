package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfTriangle 
{
	Triangle rightTriangle = new Triangle(3, 4,5 );
	Triangle ScaleneTriangle = new Triangle(2,4,3 );
	Triangle IsoscelesTriangle = new Triangle(3,4,3 );
	Triangle IsEquilateralTriangle = new Triangle(3,3,3 );
	
	@Test
	public void testOfRightTriangle() 			//Test of triangle is right traingle or not.
	{
		assertEquals(true, rightTriangle.isRightTriangle());
	}
	
	
	@Test
	public void testOfIsScaleneTriangle()				//Test of triangle is scalene traingle or not.		
	{
		assertEquals(true,ScaleneTriangle.isScaleneTriangle());
	}
	
	
	@Test
	public void testisIsoscelesTriangle()				//Test of triangle is IsoscelesTriangle traingle or not.
	{
		assertEquals(true,IsoscelesTriangle.isIsosceles());
	}
	
	
	@Test
	public void testisIsEquilateralTriangle()				//Test of triangle is Equilateral traingle or not.
	{
		assertEquals(true, IsEquilateralTriangle.isEquilateral());
	}
	

}
