package com.wzc.javase.about.annotation.myannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

     String name();

     int age() default 18;

     String[] hobbies();

}
