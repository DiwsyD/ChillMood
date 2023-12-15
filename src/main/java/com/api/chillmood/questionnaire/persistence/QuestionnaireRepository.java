package com.api.chillmood.questionnaire.persistence;

import com.api.chillmood.questionnaire.entity.Questionnaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface QuestionnaireRepository extends MongoRepository<Questionnaire, String> {
    Questionnaire findQuestionnaireByDate(LocalDate dayDate);
}
