package snakecamel;
	
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
	
public class SnakeCamelTest {
	SnakeCamelUtil snakecamel = new SnakeCamelUtil();

	@Test
	public void testSnaketoCamelcase() {
		String expected = "AbcDefGhi";
		String actual = snakecamel.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
	}
	public void testCamelToSnakecase() {
		String expected = "abc_def_ghi";
		String actual = snakecamel.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
	}

	public void testCapitalize() {
		String expected = "A";
		String actual = snakecamel.capitalize("a");
		assertThat(actual,is(expected));
	}

	public void testUncapitalize() {
		String expected = "a";
		String actual = snakecamel.uncapitalize("A");
		assertThat(actual,is(expected));
	}
}
