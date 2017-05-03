package snakecamel;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SnakecamelTest {
	@Test
	public void snakeToCamelcaseでapple_orangeをキャメルケースに変換できる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AppleOrange";
		String actual = scu.snakeToCamelcase("apple_orange");
		assertEquals(expected, actual);
	}
	@Test
	public void snakeToCamelcaseでpeach_berryをキャメルケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "PeachBerry";
		String actual = scu.snakeToCamelcase("peach_berry");
		assertEquals(expected, actual);
	}
	@Test
	public void camelToSnakecaseでAppleOrangeをスネークケースに変換できる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple_orange";
		String actual = scu.camelToSnakecase("AppleOrange");
		assertEquals(expected, actual);
	}
	@Test
	public void camelToSnakecaseでPeachBerryをスネークケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "peach_berry";
		String actual = scu.camelToSnakecase("PeachBerry");
		assertEquals(expected, actual);
	}
}
