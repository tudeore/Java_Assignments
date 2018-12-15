	package Distance;
	
	public class Distance 
	{
		private int feet;
		private float inches;
	
		public int getFeet()
		{
			return feet;
		}
		
		public void set(int feet,int inches) 
		{
			this.feet = feet;
			this.inches = inches;
		}
		
		public float getInches() 
		{
			return inches;
		}
		
		
		public Distance aditionOfTwoDistances(Distance distanceOne,Distance distanceSecond)
		{
			this.feet = distanceOne.feet +distanceSecond.feet;
			float newInches = distanceOne.inches +distanceSecond.inches;
				
				if(newInches<=12)
				{
					this.inches = newInches;
					System.out.println(this.feet+"'"+this.inches);
					return this;
				}
				else
					{
						int inch = (int) (newInches%12);				//inches
						int feet = (int) (newInches/12); 				//feet 
						this.feet = this.feet + feet;
						this.inches = this.inches +inch;
						
					}
				return this;
			
		}

		public void displayDistance() {
	
			System.out.println(this.feet+"'"+(this.inches));
		}
	}
	

