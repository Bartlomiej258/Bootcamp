package com.example.bootcampspring.reader;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;

public final class Book {

    final String title;

    public Book(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static class IfDayIsOddCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return LocalDate.now().getDayOfMonth() % 2 == 0;
        }
    }
}