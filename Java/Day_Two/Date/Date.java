/*Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-
 
class Date { 
	private int d, m, y; // data members to store the day, month and year of a date.
	public Date(int d, int m, int y) //constructor to initialize Date objects
	{
		//initialize d, m, y of the current object using the d, m, y parameters. 
	}
	public String toString()// method to get the value of a Date object printed
	{
		//return the value of a Date object as a String in d/m/y format.
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	}
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
	}*/
//----------------------------------------------------------------------------------------------------------------------------------------------------

package date;

public class Date 
{
	private int day,month,year;
	
	
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	public int getday() 
	{
		return this.day;
	}
	
	public int getmonth() 
	{
		return this.month;
	}
	
	public int getyear() 
	{
		return this.year;
	}
	
	public String toString()
	{
		System.out.println("birth date = "+this.day +"/"+this.month+"/"+this.year);
		return(this.day+"/"+this.month+"/"+this.year) ;
		
	}
	
	public boolean isSmaller(Date dateTwo)
	{
		if(this.year<dateTwo.year)
		{
			return true;
		}
		else if(this.year>dateTwo.year)
		{
			return false;
		}
		else if(this.month<dateTwo.month)
			{
				return true;
			}
		else if(this.month>dateTwo.month)
		{
			return false;
		}
		else if(this.day<dateTwo.day)
				return true;
		else	return false;	
	}
	
	public	int[] differenceInDate(Date dateTwo)
	{
		int days,months,year;
		days = this.day-dateTwo.day;
		months = this.month - dateTwo.month;
		
		year = this.year - dateTwo.year;
		int dateDiffrence[] = new int[3];
		
		dateDiffrence[0] = Math.abs(days);
		dateDiffrence[1] = Math.abs(months);
		dateDiffrence[2] = Math.abs(year);
		
		return dateDiffrence;
		
	}
	
}
