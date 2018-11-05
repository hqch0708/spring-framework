package org.springframework.aop.async;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AsyncExecutionPreProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Map;

/**
 * @author huqichao
 * @date 2018-10-16 18:19
 */
@Order(1)
@Configuration
public class StepTwoAsyncExecPreProcessor implements AsyncExecutionPreProcessor {
	/**
	 * Performs pre processing before asynchronous execution.
	 *
	 * @param invocation the method to intercept and make asynchronous
	 */
	@Override
	public void preProcessBeforeAsyncExecution(MethodInvocation invocation, Map<String, Object> paramMap) {
		System.out.println("StepTwoAsyncExecPreProcessor start key2:" + paramMap.get("key2"));
	}

	/**
	 * Transfer parameters to asynchronous execution.
	 *
	 * @param invocation the method to intercept and make asynchronous
	 * @return Transfer parameters
	 */
	@Override
	public Map<String, Object> transferParamToAsyncExecution(MethodInvocation invocation) {
		return null;
	}
}
