package com.api.chillmood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class CreateMoodFormDto {

    //private String userId;
    private Map<String, String> parameterMarkIds;
    private Integer steps;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalDate sleepEnd;
    private String Highlights;
}
