package com.api.chillmood.questionnaire.controller;

import com.api.chillmood.questionnaire.dto.QuestionnaireRequest;
import com.api.chillmood.questionnaire.dto.QuestionnaireDto;
import com.api.chillmood.questionnaire.service.QuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.path.version.v1}")
@RequiredArgsConstructor
public class CreateQuestionnaireController {

    private final QuestionnaireService questionnaireService;

    @PostMapping(path = "${app.api.path.questionnaire.createQuestionnaire}")
    public QuestionnaireDto createQuestionnaire(@RequestBody QuestionnaireRequest createQuestionnaireRequest) {
        return questionnaireService.createQuestionnaire(createQuestionnaireRequest);
    }

}
