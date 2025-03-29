package com.todo.app.todo_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TodoAppApplicationTests {

	@Test
	void contextLoads() {
		assertThat("a").isEqualTo("a");
	}

}
