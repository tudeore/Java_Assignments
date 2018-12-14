package ComplexNumbers;

public class ComplexNumbers 
{
	private float realNumber;
	private float imaginaryNumber;
	
	public float getRealNumber() {
		return realNumber;
	}
	public void setRealNumber(float realNumber) {
		this.realNumber = realNumber;
	}
	public float getImaginaryNumber() {
		return imaginaryNumber;
	}
	public void setImaginaryNumber(float imaginaryNumber) {
		this.imaginaryNumber = imaginaryNumber;
	}
	
	
	
	public void setUp(float realNumber,float imaginaryNumber)
	{
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	public void display()
	{
		System.out.println(realNumber+"i"+imaginaryNumber);
	}
	
	public ComplexNumbers sum(ComplexNumbers numberOne,ComplexNumbers numberTwo)
	{
		this.realNumber = numberOne.realNumber + numberTwo.realNumber;
		this.imaginaryNumber = numberOne.imaginaryNumber + numberTwo.imaginaryNumber;
		return this;
	
	}
	
}
