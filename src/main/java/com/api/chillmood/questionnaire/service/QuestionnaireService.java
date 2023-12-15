package com.api.chillmood.questionnaire.service;

import com.api.chillmood.questionnaire.bean.QuestionnaireMapper;
import com.api.chillmood.questionnaire.dto.QuestionAnswerIdsDto;
import com.api.chillmood.questionnaire.dto.QuestionnaireRequest;
import com.api.chillmood.questionnaire.dto.QuestionnaireDto;
import com.api.chillmood.questionnaire.dto.QuestionAnswerDto;
import com.api.chillmood.questionnaire.entity.Questionnaire;
import com.api.chillmood.questionnaire.persistence.QuestionnaireRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class QuestionnaireService {
    /**
     * All forms could be retrieved by any parameters only with userId in request.
     */
    private final QuestionnaireRepository questionnaireRepository;
    private final QuestionnaireMapper questionnaireMapper;

    //Retrieve MoodForm for the given date (day)
    public QuestionnaireDto getQuestionnaireByDate(String userId, LocalDate dayDate) {
        return questionnaireMapper.mapQuestionnaireToQuestionnaireDto(questionnaireRepository.findQuestionnaireByDate(dayDate));
    }

    //Retrieve MoodForm for the given date range (e.g. month)
    public List<QuestionnaireDto> getQuestionnairesInDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    public QuestionnaireDto createQuestionnaire(QuestionnaireRequest newQuestionnaireRequest) {
        // Also, validate the DTO.
        log.traceEntry("with request new form", newQuestionnaireRequest);
        Questionnaire questionnaire = questionnaireMapper.mapNewQuestionnaireRequestToQuestionnaire(newQuestionnaireRequest);
        Questionnaire savedQuestionnaire = questionnaireRepository.save(questionnaire);
        QuestionnaireDto newQuestionnaireDto = questionnaireMapper.mapQuestionnaireToQuestionnaireDto(savedQuestionnaire);
        return log.traceExit(newQuestionnaireDto);
    }

}
