public class armstrongSeries {
	public static void main(String[] args){
	        int number;
		int firstNumber = 0;
		int secondnumber = 0;
		int thiredNumber = 0;
		int x=0;
		int qube1 = 0;
		
		for(number=100;number<=999;number++){
		x = number/10; //15
		firstNumber = x/10; //1
		qube1 = firstNumber*firstNumber*firstNumber;//1
		secondnumber = x%10; //5
		int qube2 = secondnumber*secondnumber*secondnumber ;
		thiredNumber = number%10;//3
		int qube3 = thiredNumber*thiredNumber*thiredNumber ;
		int variable = qube1 + qube2 + qube3;
				if(variable == number)
				{
				System.out.println(variable);	
				}
               }
 		
		
			
		
		
	}

}