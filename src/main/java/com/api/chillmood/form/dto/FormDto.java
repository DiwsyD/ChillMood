package com.api.chillmood.form.dto;

import com.api.chillmood.form.entity.LogParameter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class FormDto {

    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate date;
    private List<LogParameter> logParameter;
    private Integer steps;
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String highlights;
}
