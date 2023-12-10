package com.api.chillmood.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("Mark")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mark {

    @MongoId
    private String id;

    private String title;
    private String description;
    private String color;
}
