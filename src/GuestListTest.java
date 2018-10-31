import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuestListTest {

	@Test
	public void testGetCount() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		// Act
		int actual = guestList.getCount();

		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCountTwo() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);

		// Act
		int actual = guestList.getCount();

		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetMemberCount() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);

		// Act
		int actual = guestList.getMemberCount();

		// Assert
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetMemberCountTwo() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", 47, true);
		guestList.add("David", 13, true);

		// Act
		int actual = guestList.getMemberCount();

		// Assert
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void getSum() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", 47, true);
		guestList.add("David", 13, true);

		// Act
		int actual = guestList.getSum();

		// Assert
		int expected = 163;
		assertEquals(expected, actual);
	}

	@Test
	public void getSumTwo() {
		// Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", 47, true);
		guestList.add("David", 13, true);
		guestList.add("Tim", 74, false);

		// Act
		int actual = guestList.getSum();

		// Assert
		int expected = 237;
		assertEquals(expected, actual);
	}

}
