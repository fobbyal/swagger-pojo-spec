package org.al.swagger.v2.schema;

import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by showdown on 4/5/2015 at 7:04 PM.
 * Project REST-POJO
 */
public class JDKPrimitiveType {


    private static final Set<Class<?>> PRIMITIVE_TYPES;

    public static boolean isPrimitiveType(Class<?> clazz) {
        return PRIMITIVE_TYPES.contains(clazz) || clazz.isPrimitive();
    }

    static {
        HashSet<Class<?>> set = new HashSet<>();
        set.add(Boolean.class);
        set.add(Character.class);
        set.add(Byte.class);
        set.add(Short.class);
        set.add(Integer.class);
        set.add(Long.class);
        set.add(Float.class);
        set.add(Double.class);
        set.add(Void.class);
        set.add(String.class);
        set.add(Date.class);
        set.add(Instant.class);

        PRIMITIVE_TYPES = Collections.unmodifiableSet(set);

    }


}
