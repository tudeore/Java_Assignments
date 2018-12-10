class Hello{
	public static void main(String[] args)
        {
		addition(10,20);		
		subtraction(10,20);
		multification(10,20);
		division(45,20);
		
		
        }
	static int addition(int numberOne, int numberTwo)
	{
	 int add= numberOne+numberTwo;
	 System.out.println("addition = " +add);
	 return (numberOne+numberTwo);
		
	}
	
	static int subtraction(int numberOne, int numberTwo)
	{
	 int subtract= numberTwo-numberOne;
	 System.out.println("subtraction = " +subtract);
	 return (numberTwo-numberOne);
		
	}
	static int multification(int numberOne, int numberTwo)
	{
	 int multification= numberOne*numberTwo;
	 System.out.println("multification = " +multification);
	 return (numberOne*numberTwo);
		
	}
	static int division(int numberOne, int numberTwo)
	{
	 int division= numberOne/numberTwo;
	 System.out.println("division = " +division);
	 return (numberOne/numberTwo);
		
	}

}