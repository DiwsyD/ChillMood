package com.api.chillmood.config.mapper;

import com.api.chillmood.questionnaire.bean.QuestionnaireMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public QuestionnaireMapper modelMapper() {
        return new QuestionnaireMapper();
    }
}
