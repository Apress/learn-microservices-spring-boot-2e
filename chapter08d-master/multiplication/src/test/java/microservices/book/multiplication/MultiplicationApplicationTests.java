package microservices.book.multiplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:/test.properties")
class MultiplicationApplicationTests {

	@Test
	void contextLoads() {
	}

}
