package com.api.chillmood.form.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LogParameter {
    /**
     * LogParameter - One of the user's day parameter (e.g. Mood or Health) and mark of it's parameter.
     * */
    private Parameter parameter;
    private Mark mark;
}
