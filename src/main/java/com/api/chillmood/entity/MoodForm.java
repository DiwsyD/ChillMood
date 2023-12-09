package com.api.chillmood.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Document("MoodForm")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoodForm {

    @MongoId
    private String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private List<LogParameter> logParameters;
    private Integer steps;
    @DateTimeFormat(pattern = "HH:mm")
    private Date sleepStart;
    @DateTimeFormat(pattern = "HH:mm")
    private Date sleepEnd;
    private String Highlights;
}
