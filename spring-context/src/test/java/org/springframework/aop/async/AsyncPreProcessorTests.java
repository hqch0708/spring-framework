package org.springframework.aop.async;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * @author huqichao
 * @date 2018-10-16 18:23
 */
public class AsyncPreProcessorTests {

	@Test
	public void testAsyncCall(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AsyncConfig.class);
		ctx.refresh();

		TestService testService = ctx.getBean(TestService.class);
		try {
			testService.sayHello();
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Configuration
	@EnableAsync(proxyTargetClass = true)
	@ComponentScan("org.springframework.aop.async")
	static class AsyncConfig {

		@Bean
		public TestService testService() {
			return new TestService();
		}
	}

	static class TestService {
		@Async
		public void sayHello(){
			System.out.println("Hi...");
		}
	}
}
