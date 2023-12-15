package com.api.chillmood.questionnaire.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class QuestionnaireRequest {

    private List<QuestionAnswerIdsDto> questionAnswerIds;
    private Integer steps;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String Highlights;
}
