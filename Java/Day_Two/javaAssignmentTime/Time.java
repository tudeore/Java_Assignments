package Time;

public class Time {
	private int hours;
	private int minutes;
	
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setTime(int hours,int minutes) 
	{
		if(hours<24 && minutes<60)
		{
		this.hours = hours;
		this.minutes = minutes;
		}
		else
		{
			this.hours = -1;
			this.minutes = -1;
		}
	}

	
	public Time sumOfTime(Time timeOne, Time timeTwo)
	{
		if(timeOne.hours<0 || timeOne.minutes<0 || timeTwo.hours<0 || timeTwo.minutes<0)
		{
			this.hours = -1;
			this.minutes =-1;
			
			return this;
		}
		else
		{
			this.hours = timeOne.hours + timeTwo.hours;
			int newMinutes = timeOne.minutes + timeTwo.minutes;
		
			if(newMinutes<60)
			{
				this.minutes = newMinutes;
			} 
			else {
					int minute = newMinutes%60;     // minutes
					int hour = newMinutes /60 ;     //hours
					this.hours = this.hours + hour;
					this.minutes = this.minutes +minute;
					System.out.println(this.hours+":"+this.minutes);
			}
		
		return this;
		}
	}
}
