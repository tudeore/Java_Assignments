package Time;

import static org.junit.Assert.*;

import org.junit.Test;


	public class TestTime 
	{
		
		private Time timeOne = new Time();
		private Time timeTwo = new Time();
		private Time timeThree = new Time();
		
		
		@Test
			public void testadditionOfHours()
			{
				timeOne.setTime(2,30);
				timeTwo.setTime(20,0);									
				
				timeThree.sumOfTime(timeOne,timeTwo);
				assertEquals(22,timeThree.getHours());
			}
		
		
		@Test
			public void testadditionOfMinutes()
			{
				timeOne.setTime(2,30);
				timeTwo.setTime(20,0);									
				
				timeThree.sumOfTime(timeOne,timeTwo);
				assertEquals(30,timeThree.getMinutes());
			}
		
		
		@Test
			public void testOfTimeAboveMilitaryTime()
			{
				timeOne.setTime(2,30);
				timeTwo.setTime(34,0);									
				
				timeThree.sumOfTime(timeOne,timeTwo);
				assertEquals(-1,timeThree.getMinutes());
			}
		
		
		@Test
		public void testOfTimeIsNegativeTime()
		{
			timeOne.setTime(-2,30);
			timeTwo.setTime(12,0);									
			
			timeThree.sumOfTime(timeOne,timeTwo);
			assertEquals(-1,timeThree.getMinutes());
		}
	
	}
