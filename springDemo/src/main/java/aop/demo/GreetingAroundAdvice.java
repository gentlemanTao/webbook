package aop.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @Author: Gentleman
 * @Date: 2018/11/7 0:31
 * @Description:环绕增强:需要继承MethodInterceptor接口
 **/
@Component
public class GreetingAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object result=methodInvocation.proceed ();
        after();
        return null;
    }

    private void before() {
        System.out.println ("GreetingAroundAdvice Before");
    }
    private void after() {
        System.out.println ("GreetingAroundAdvice After");
    }
}
