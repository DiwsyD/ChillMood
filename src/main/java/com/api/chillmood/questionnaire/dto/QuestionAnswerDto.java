package com.api.chillmood.questionnaire.dto;

import com.api.chillmood.questionnaire.entity.Answer;
import com.api.chillmood.questionnaire.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class QuestionAnswerDto {
    /**
     * LogParameter - One of the user's day parameter (e.g. Mood or Health) and mark of it's parameter.
     * */
    private Question question;
    private Answer answer;
}
