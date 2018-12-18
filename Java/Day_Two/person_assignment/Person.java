package person_assignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person 
{
	
	private String name;
	private int day;
	private int month;
	private int year;


	public String getName() {
		return name;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	
	public Person(String name,int day,int month,int year)
	{
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//currentAge of person one and two.	
	
	public String currentAge(Person personTwo)
	{	
		LocalDate now = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(this.getYear(),this.month,this.day); //Birth date
		LocalDate now1 = LocalDate.now();
		Period age = Period.between(birthday, now1);							// comparison between current date and birth date.
		return (age.getYears()+"year  "+age.getMonths()+"month  "+age.getDays()+"days");
	}


//age difference between two person	
	
	public String isOlder(Person personTwo)
	{	
		LocalDate now = LocalDate.now();                          
		LocalDate birthday = LocalDate.of(this.getYear(),this.month,this.day); 							//birth date of person one.
		LocalDate now1 = LocalDate.of(personTwo.getYear(),personTwo.getMonth(),personTwo.getDay());		// birth date of person two.
		Period diff = Period.between(birthday, now1);													//comparison between two dates.
		return (diff.getYears()+"year  "+diff.getMonths()+"month  "+diff.getDays()+"days");
	}
	
}