package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

	public class TestDistances 
	{
		private Distance distanceOne = new Distance();
		private Distance distanceSecond = new Distance();
		private Distance additionOfdistanceOneAndTwo = new Distance();
	
		@Test
		public void testadditionOfFeet()
		{
			distanceOne.set(2,3);
			distanceSecond.set(3,9);									//sets second complex number's value
			
			additionOfdistanceOneAndTwo.aditionOfTwoDistances(distanceOne,distanceSecond);
			assertEquals(5,additionOfdistanceOneAndTwo.getFeet(),0);
			
		
		}
		
		@Test
		public void testadditionOfInches()
		{
			distanceOne.set(2,3);
			distanceSecond.set(3,9);									//sets second complex number's value
			
			additionOfdistanceOneAndTwo.aditionOfTwoDistances(distanceOne,distanceSecond);
			assertEquals(12,additionOfdistanceOneAndTwo.getInches(),0);
			
			additionOfdistanceOneAndTwo.displayDistance();
			
		}
	
	}
