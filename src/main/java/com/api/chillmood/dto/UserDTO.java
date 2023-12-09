package com.api.chillmood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String name;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

}
