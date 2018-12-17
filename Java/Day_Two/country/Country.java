/*Define a class Country that stores the name of the country, its population, and its area. 
 Using that class, write a test program that creates a few countries and stores them in an array and 
 then prints.
The country with the largest area
The country with the largest population
The country with the largest population density (people per square mile)

NOTE: Write appropriate TestCases.*/
//---------------------------------------------------------------------------------------------------------
package country;

public class Country 
{
	private String country;
	private int population;
	private int area;
	
	public String getCountry() {
		return country;
	}

	public int getPopulation() {
		System.out.println(population);
		return this.population;
	}

	public int getArea() {
		return area;
	}


	public Country(String country,int population,int area)
	{
		this.country = country;
		this.population = population;
		this.area = area;
	}
	
}
