import static org.junit.Assert.*;

import org.junit.Test;


public class DiscountTest {


	@Test
	public void testTheNewPrice() 
		{
		 DiscountOnItems testTheDiscount = new DiscountOnItems(); 
		 assertEquals(1300,testTheDiscount.discountOnItems(2000));
		}
	
}
