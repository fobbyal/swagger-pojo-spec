package org.al.swagger.v2.schema;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by showdown on 4/5/2015 at 7:25 PM.
 * Project REST-POJO
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AsType {
    Class<?> type();
}
