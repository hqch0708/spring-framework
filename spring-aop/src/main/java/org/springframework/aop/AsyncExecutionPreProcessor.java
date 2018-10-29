package org.springframework.aop;

import org.aopalliance.intercept.MethodInvocation;

import java.util.Map;

/**
 * Performs pre processing before asynchronous execution.
 * @author huqichao
 * @date 2018-10-16 17:35
 */
public interface AsyncExecutionPreProcessor {

	/**
	 * Performs pre processing before asynchronous execution.
	 * @param invocation the method to intercept and make asynchronous
	 * @param paramMap parameters
	 */
	void preProcessBeforeAsyncExecution(MethodInvocation invocation, Map<String, Object> paramMap);


	/**
	 * Transfer parameters to asynchronous execution.
	 * @param invocation the method to intercept and make asynchronous
	 * @return Transfer parameters
	 */
	Map<String, Object> transferParamToAsyncExecution(MethodInvocation invocation);
}
