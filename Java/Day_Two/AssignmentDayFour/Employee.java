package AssignmentDayFour;

public class Employee {
	private int id;
	private String name;
	private double monthlyBasic;
	private double PF = 10;
	
		public double getPfRate()
		{
			return PF;
		}
		public void setPfRate(float pfRate) 
		{
		this.PF = PF;
		}
		public int getId() 
		{
			System.out.println(id);
			return id;
		}
		public int setId(int id)
		{
			return this.id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		
		public double getMonthlyBasic() 
		{
			return monthlyBasic;
		}
		
		public void setMonthlyBasic(double monthlyBasic) 
		{
			this.monthlyBasic = monthlyBasic;
		}
	////////////////////////***************************************************///////////////////////////////////////////	
			
			double getAnnualBasic()
			{
				return (12*monthlyBasic);
			}
			
			double getMonthlyGrossSalary()
			{
				double hra=0;
				hra = hra*0.5;
				int medical = 1250;
				int conveyance = 800;
				
				if(monthlyBasic<=0)
				return 0;
				System.out.println("getmonthlyGrosssalary = " + (monthlyBasic + hra + medical + conveyance));
				return ( monthlyBasic + hra + medical + conveyance);
			}
			
			double getAnnualGrossSalary()
			{
				return (12*getMonthlyGrossSalary());
			}
			
			double getMonthlyDeductions()
			{
			
				if(getMonthlyBasic()>6500)
					{
						PF=6500;
					}else 
						PF=getMonthlyBasic()*0.1;
				
				double ESIC;
				if(getMonthlyBasic()<=5000)
						{
							ESIC = 0.0475*getMonthlyBasic();
						}else {
								ESIC = 0;
							  }
				double professionalTax;
					if(getMonthlyGrossSalary()<=10000)
					{
						professionalTax = 50;
					}	
					else{ 
							professionalTax = 100;
						} 
						System.out.println("getMonthlyDeduction = "+(PF +ESIC+professionalTax));
						return (PF +ESIC+professionalTax);
			
					}
			 double getMonthlyTakeHome()
			 	{
				System.out.println("monthly take home "+(getMonthlyGrossSalary()- getMonthlyDeductions()));
				return (getMonthlyGrossSalary()- getMonthlyDeductions());
			 	}
			 
			 double getAnnualTakeHome()
			 	{
				 System.out.println("getAnnualTakeHome = " + (12*getMonthlyTakeHome()));
				 return(12*getMonthlyTakeHome());
			 	}
			 
			 
		
}
