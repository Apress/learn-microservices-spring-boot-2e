package microservices.book.logs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:/test.properties")
class LogsApplicationTests {

	@Test
	void contextLoads() {
	}

}
