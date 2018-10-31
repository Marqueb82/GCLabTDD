import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HikerTest {

	@Test
	public void testEmpty() {
		// Output here
		String expected = "0";
		// Input parameter for function
		String actual = Hiker.answer("");
		assertEquals(expected, actual);
	}

	@Test
	public void testSingleValue() {
		// Output here
		String expected = "1";
		// Input parameter for function
		String actual = Hiker.answer("1");
		assertEquals(expected, actual);
	}

	@Test
	public void testTwoValueSum() {
		// Output here
		String expected = "2";
		// Input parameter for function
		String actual = Hiker.answer("1,1");
		assertEquals(expected, actual);
	}

	@Test
	public void testTwoValueSumTwo() {
		// Output here
		String expected = "15";
		// Input parameter for function
		String actual = Hiker.answer("5,5,5");
		assertEquals(expected, actual);
	}

	@Test
	public void testTwoValueSumThree() {
		// Output here
		String expected = "30";
		// Input parameter for function
		String actual = Hiker.answer("5,5,5,5,5,5");
		assertEquals(expected, actual);
	}

	@Test
	public void testTwoValueSumFour() {
		// Output here
		String expected = "10";
		// Input parameter for function
		String actual = Hiker.answer("5\n5");
		assertEquals(expected, actual);
	}

}
