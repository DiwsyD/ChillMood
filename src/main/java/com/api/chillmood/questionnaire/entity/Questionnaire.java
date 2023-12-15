package com.api.chillmood.questionnaire.entity;

import com.api.chillmood.questionnaire.dto.QuestionAnswerIdsDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Document("Questionnaire")
@Data
@Builder
public class Questionnaire {

    @MongoId
    private String id;
    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate date;
    private List<QuestionAnswerIdsDto> questionAnswerIds;
    private Integer steps;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepStart;
    @DateTimeFormat(pattern = "${format.time}")
    private LocalDate sleepEnd;
    private String highlights;
}
