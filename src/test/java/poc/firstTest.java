package poc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class firstTest {
	@DisplayName("Spring boot test pour le poc")
	@Test
	void testGet() {
		assertEquals("Hello JUnit 5", "Hello JUnit 5");
	}
}
