package com.api.chillmood.form.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("Parameter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Parameter {

    @MongoId
    private String id;

    private String title;
    private String description;
}
