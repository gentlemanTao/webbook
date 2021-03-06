package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author: Gentleman
 * @Date: 2018/11/11 18:08
 * @Description:切面注解
 **/
@Target (ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
