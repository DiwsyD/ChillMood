package com.api.chillmood.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Data
public class AccountDto {
    private String name;
    private String gender;
    @DateTimeFormat(pattern = "${format.date}")
    private LocalDate dateOfBirth;

}
