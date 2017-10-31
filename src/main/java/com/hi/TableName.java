package com.hi;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME )
public @interface TableName {
    /**
     * 字段名
     * @return
     */
    String value() default "未定义中文名";
}
