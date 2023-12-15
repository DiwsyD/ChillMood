package com.api.chillmood.questionnaire.controller;

import com.api.chillmood.questionnaire.dto.QuestionnaireDto;
import com.api.chillmood.questionnaire.service.QuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "${app.api.path.version.v1}")
@RequiredArgsConstructor
public class GetQuestionnaireByDatesController {

    private final QuestionnaireService questionnaireService;

    @GetMapping(path = "${app.api.path.questionnaire.getQuestionnaireByDay}")
    public QuestionnaireDto getQuestionnaireByDay(@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate day) {
        System.out.println("Date: " + day.getClass());

        return null;
    }

    @GetMapping(path = "${app.api.path.questionnaire.getQuestionnaireByDateRange}")
    public QuestionnaireDto getQuestionnaireByDateRange(
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate from,
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate to
    ) {
        System.out.printf("From: %tF - To: %tF ", from, to);

        return null;
    }
}
