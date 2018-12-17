/*Write a class called Triangle that can be used to represent a triangle. It should include the following methods 
  that return boolean values indicating if the particular property holds:
isRight (a right triangle)
isScalene (no two sides are the same length)
isIsosceles (exactly two sides are the same length)
isEquilateral (all three sides are the same length)
Write a simple tester program that creates a few triangles and asks them about their type.
NOTE: Write appropriate TestCases.*/
//---------------------------------------------------------------------------------------------------------------------------
package triangle;

public class Triangle 
{
	private int sideOne;			
	private int sideTwo;
	private int sideThree;
	
	public int getSideOne() 			//to get the value of instance variable.
	{
		return sideOne;
	}
	
	public int getSideTwo() 			//to get the value of instance variable.
	{
		return sideTwo;
	}

	public int getSideThree() 			//to get the value of instance variable.
	{
		return sideThree;
	}

	
	public Triangle (int sideOne,int sideTwo,int sideThree)  	//constructor to set the value of instance variable.
	{
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public boolean isRightTriangle() 				// check for the right triangle.
	{
		int largestSide;
		if(sideOne>sideTwo && sideOne>sideThree)
		{
			largestSide = sideOne;
			return (largestSide*largestSide == sideTwo*sideTwo +sideThree*sideThree)? true : false;
			
		} 
		else if(sideTwo>sideOne && sideTwo>sideThree)		
		{
			largestSide = sideTwo;
			return (largestSide*largestSide == sideOne*sideOne +sideThree*sideThree)? true : false;
		} 
		else 
		{
			largestSide = sideThree;
			return (largestSide*largestSide == sideOne*sideOne +sideTwo*sideTwo)? true : false;
		}
		
	}

	public boolean isScaleneTriangle()						//check for the Scalene Triangle.
	{
		if(sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree)
		{	
			return true;
		} 
		else return false; 	
	}
	
	
	public boolean isIsosceles()
	{
	if(sideOne == sideTwo || sideOne == sideThree||sideTwo == sideThree)
			return true;
			return false;
	}
	
	public boolean isEquilateral()
	{
		if(sideOne == sideTwo && sideOne == sideThree)
			return true;
			return false;
	}
	
}

	
