package com.api.chillmood.form.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Map;

@Builder
@Data
public class CreateFormRequest {

    //private String userId;
    private Map<String, String> parameterMarkIds;
    private Integer steps;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String Highlights;
}
