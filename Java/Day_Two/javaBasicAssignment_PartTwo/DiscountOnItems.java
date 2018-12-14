
public class DiscountOnItems {

	public int discountOnItems(int input) 
	{
		int price = input;
		double newItem;
	    float discountPrice = (float) (price*0.35);
	    
	    int  newPrice =(int) (price - discountPrice);
	    System.out.println(newPrice);
	    return (newPrice);
	}
	
}
