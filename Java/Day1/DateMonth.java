import java.util.Scanner;

public class DateMonth {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a date(dd-mm-yyyy)");
	String date= sc.next();
	int day = Integer.parseInt(date.substring(0,2));
	int month = Integer.parseInt(date.substring(3,5));
	int year = Integer.parseInt(date.substring(5,10));
	System.out.println("month is: "+month);
	switch(month)
	{
	case 01:System.out.println(day+"-" +" January "+ year);break;
	case 02:System.out.println(day+"-" +"Feb"+ year);break;
	case 03:System.out.println(day+"-" +"March"+ year);break;
	case 04:System.out.println(day+"-" +"April"+ year);break;
	case 05:System.out.println(day+"-" +"May"+ year);break;
	case 06:System.out.println(day+"-" +"June"+ year);break;
	case 07:System.out.println(day+"-" +"July"+ year);break;
	case 8:System.out.println(day+"-" +"August"+ year);break;
	case 9:System.out.println(day+"-" +"September"+ year);break;
	case 10:System.out.println(day+"-" +"Octomber"+ year);break;
	case 11:System.out.println(day+"-" +"November"+ year);break;
	case 12:System.out.println(day+"-" +"December"+ year);break;
	}
}
}