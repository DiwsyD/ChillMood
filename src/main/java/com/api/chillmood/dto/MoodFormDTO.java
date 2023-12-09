package com.api.chillmood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class MoodFormDTO {

    //LogParameterId:MarkId
    private Map<String, String> LogParametersMarks;
    private Integer steps;
    @DateTimeFormat(pattern = "HH:mm")
    private Date sleepStart;
    @DateTimeFormat(pattern = "HH:mm")
    private Date sleepEnd;
    private String Highlights;
}
