package com.hi;
import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME )
public @interface TableU {
    /**
     * 表名
     * @return
     */
    String value() default "未定义表名";
}

