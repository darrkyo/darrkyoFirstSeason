package com.trs.interceptor;

import com.season.aop.Interceptor;
import com.season.aop.Invocation;

/**
 * Created by SONY on 2016/12/5.
 */
public class myInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation invocation) {
        System.out.println("方法执行前");
        invocation.invoke();
        System.out.println("方法执行后");
    }
}
