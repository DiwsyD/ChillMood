package com.api.chillmood.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document("User")//TODO: Change to "Account"
@Data
@Builder
public class Account {

    @MongoId
    private String id;

    private String name;
    private String gender;
    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate dateOfBirth;

}
