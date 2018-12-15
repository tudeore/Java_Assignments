package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayTest {

	@Test
	public void test() {
		 Distance distance = new Distance();
		 distance.set(5,5);
		 distance.displayDistance();
	}

}
