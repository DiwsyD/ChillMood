package com.api.chillmood.questionnaire.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("Answer")
@Data
@Builder
public class Answer {

    @MongoId
    private String id;

    private String title;
    private String description;
    private String color;
}
