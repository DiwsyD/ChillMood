package com.api.chillmood.form.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Document("MoodForm")
@Data
@Builder
public class Form {
    /**
     * MoodForm - is a filled form of information about the user's day.
     */
    @MongoId
    private String id;
    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate date;
    private List<LogParameter> logParameters;
    private Integer steps;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String highlights;
}
