package org.springframework.core.task;

import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author huqichao
 * @date 2018-10-28 11:08
 */
public class AsyncThread<V> implements Callable<V> {

    private Map<String, Object> paramMap;

    public AsyncThread(Map<String, Object> paramMap){
        this.paramMap = paramMap;
    }

    public Map<String, Object> getMaramMap(){
        return this.paramMap;
    }

    @Override
    public V call() throws Exception {
        return null;
    }
}
