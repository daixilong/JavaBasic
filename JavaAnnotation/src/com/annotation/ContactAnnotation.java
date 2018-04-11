package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.util.ContactType;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ContactAnnotation {

	public ContactType type();
}
