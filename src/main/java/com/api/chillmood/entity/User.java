package com.api.chillmood.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document("User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @MongoId
    private String id;

    private String name;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

}
