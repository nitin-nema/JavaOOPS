package com.example.LamdaEtc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value = "Custom Annotation Example")
class AnnotatedClass {
    @MyAnnotation(value = "Method Annotation")
    public void annotatedMethod() {
        System.out.println("Method with custom annotation");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        AnnotatedClass obj = new AnnotatedClass();

        // Accessing class-level annotation
        MyAnnotation classAnnotation = AnnotatedClass.class.getAnnotation(MyAnnotation.class);
        System.out.println("Class Annotation Value: " + classAnnotation.value());

        // Accessing method-level annotation
        MyAnnotation methodAnnotation = AnnotatedClass.class.getMethod("annotatedMethod").getAnnotation(MyAnnotation.class);
        System.out.println("Method Annotation Value: " + methodAnnotation.value());

        obj.annotatedMethod();
    }
}

