package org.springframework.aop.async;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.groovy.util.Maps;
import org.springframework.aop.AsyncExecutionPreProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Map;

/**
 * @author huqichao
 * @date 2018-10-16 18:19
 */
@Order(2)
@Configuration
public class StepOneAsyncExecPreProcessor implements AsyncExecutionPreProcessor {
	/**
	 * Performs pre processing before asynchronous execution.
	 *
	 * @param invocation the method to intercept and make asynchronous
	 */
	@Override
	public void preProcessBeforeAsyncExecution(MethodInvocation invocation, Map<String, Object> paramMap) {
		System.out.println("StepOneAsyncExecPreProcessor start key1:" + paramMap.get("key1"));
	}

	/**
	 * Transfer parameters to asynchronous execution.
	 *
	 * @param invocation the method to intercept and make asynchronous
	 * @return Transfer parameters
	 */
	@Override
	public Map<String, Object> transferParamToAsyncExecution(MethodInvocation invocation) {
		return Maps.of("key1", "value1");
	}
}
