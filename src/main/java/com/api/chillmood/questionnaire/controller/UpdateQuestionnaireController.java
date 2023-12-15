package com.api.chillmood.questionnaire.controller;

import com.api.chillmood.questionnaire.dto.QuestionnaireRequest;
import com.api.chillmood.questionnaire.dto.QuestionnaireDto;
import com.api.chillmood.questionnaire.service.QuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${app.api.path.version.v1}")
@RequiredArgsConstructor
public class UpdateQuestionnaireController {

    private final QuestionnaireService questionnaireService;

    @PatchMapping(path = "${app.api.path.questionnaire.updateQuestionnaire}")
    public QuestionnaireDto updateQuestionnaire(@RequestBody QuestionnaireRequest updateQuestionnaireRequest) {
        return null;
    }

}
