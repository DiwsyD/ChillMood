package com.api.chillmood.questionnaire.bean;

import com.api.chillmood.questionnaire.dto.QuestionAnswerDto;
import com.api.chillmood.questionnaire.dto.QuestionAnswerIdsDto;
import com.api.chillmood.questionnaire.dto.QuestionnaireDto;
import com.api.chillmood.questionnaire.dto.QuestionnaireRequest;
import com.api.chillmood.questionnaire.entity.Questionnaire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionnaireMapper {

    public Questionnaire mapNewQuestionnaireRequestToQuestionnaire(QuestionnaireRequest newQuestionnaireRequest) {
        return Questionnaire.builder()
                .date(LocalDate.now())
                .questionAnswerIds(newQuestionnaireRequest.getQuestionAnswerIds())
                .steps(newQuestionnaireRequest.getSteps())
                .sleepStart(newQuestionnaireRequest.getSleepStart())
                .sleepEnd(newQuestionnaireRequest.getSleepEnd())
                .highlights(newQuestionnaireRequest.getHighlights())
                .build();
    }

    public QuestionnaireDto mapQuestionnaireToQuestionnaireDto(Questionnaire questionnaire) {
        List<QuestionAnswerDto> questionAnswerDtos = mapQuestionAnswerIdsToQuestionAnswerDtos(questionnaire.getQuestionAnswerIds());
        return QuestionnaireDto.builder()
                .date(questionnaire.getDate())
                .questionAnswer(questionAnswerDtos)
                .steps(questionnaire.getSteps())
                .sleepStart(questionnaire.getSleepStart())
                .sleepEnd(questionnaire.getSleepEnd())
                .highlights(questionnaire.getHighlights())
                .build();
    }

    private List<QuestionAnswerDto> mapQuestionAnswerIdsToQuestionAnswerDtos(List<QuestionAnswerIdsDto> questionAnswerIds) {
        //TODO: 1. Retrieve questions and it's answers by Ids and combine it here?
        // or
        //      2. Retrieve questions&answers in #mapNewQuestionnaireRequestToQuestionnaire to be able to use @DbRef?
        // 1 - longer put faster get, 2 - faster put, longer get.
        return questionAnswerIds.stream()
                .map(qaId -> QuestionAnswerDto.builder()
                        .question(null)
                        .answer(null)
                        .build()
                )
                .collect(Collectors.toList());
    }

}
