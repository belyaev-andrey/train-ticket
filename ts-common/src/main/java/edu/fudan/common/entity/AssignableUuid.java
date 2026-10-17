package edu.fudan.common.entity;

import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A UUID id that Hibernate generates only when the entity has none. Since Hibernate 6.6, merging an
 * entity whose id is set by hand but uses a plain generator fails, which breaks the seed data in the
 * InitData runners.
 */
@IdGeneratorType(AssignableUuidGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface AssignableUuid {

    /**
     * 32 hex characters without dashes, the format of the legacy {@code "uuid"} strategy.
     */
    boolean hex() default false;
}
