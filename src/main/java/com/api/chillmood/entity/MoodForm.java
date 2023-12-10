package com.api.chillmood.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;

@Document("MoodForm")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoodForm {
    /**
     * MoodForm - is a filled form of information about the user's day.
     */
    @MongoId
    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private List<LogParameter> logParameters;
    private Integer steps;
    @JsonFormat(pattern = "HH:mm")
    private LocalDate sleepStart;
    @JsonFormat(pattern = "HH:mm")
    private LocalDate sleepEnd;
    private String Highlights;
}
