package country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestOfcountry 
{
	Country countries[] = new Country[3];
	
	@Before
	public void setUp()
	{
		countries= new Country[3];							//array for country data
		countries[0] = new Country("India",20000,500);
		countries[1] = new Country("Pakistan",10000,100);
		countries[2] = new Country("America",15000,150);
	}
	
	
	@Test
	public void populationTest()						//test case to check highest population of country.
	{
		
		int highestPopulation = countries[0].getPopulation();
		System.out.println("Highest population = "+ highestPopulation);
		
		for(int count = 1;count<countries.length;count++)
		{
			if(highestPopulation< countries[count].getPopulation())
			{
				highestPopulation = countries[count].getPopulation();
			}
		}
		assertEquals(20000,highestPopulation,0);
	}
	
	
	@Test
	public void AreaOfCountryTest()						//test case to check to largest area of country.
	{
		
		int highestArea = countries[0].getArea();
		System.out.println("Highest population = "+ highestArea);
		
		for(int count = 1;count<countries.length;count++)
		{
			if(highestArea< countries[count].getArea())
			{
				highestArea = countries[count].getArea();
			}
		}
		assertEquals(500,highestArea,0);
	}
	
	
	@Test
	public void largestPopulationDensityTest()			// test case to check largest population density in the country.
	{
		int highestPopulationDensity = countries[0].getPopulation()/countries[0].getArea();
		System.out.println("Highest population = "+ highestPopulationDensity);
		
		for(int count = 1;count<countries.length;count++)
		{
			if(highestPopulationDensity< countries[count].getPopulation()/countries[0].getArea())
			{
				highestPopulationDensity = countries[count].getPopulation()/countries[0].getArea();
			}
		}
		assertEquals(40,highestPopulationDensity,0);
	}
}