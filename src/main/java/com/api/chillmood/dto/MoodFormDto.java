package com.api.chillmood.dto;

import com.api.chillmood.entity.LogParameter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
public class MoodFormDto {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private List<LogParameter> logParameter;
    private Integer steps;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalDate sleepEnd;
    private String highlights;
}
