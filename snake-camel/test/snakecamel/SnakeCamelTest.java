package snakecamel;
	
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
	
public class SnakeCamelTest {

	@Test
	public void test() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = "A";
		String actual = snakecamel.capitalize("a");
		assertThat(actual,is(expected));
	}

}
