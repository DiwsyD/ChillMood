package com.api.chillmood.questionnaire.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class QuestionnaireDto {

    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate date;
    private List<QuestionAnswerDto> questionAnswer;
    private Integer steps;
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String highlights;
}
