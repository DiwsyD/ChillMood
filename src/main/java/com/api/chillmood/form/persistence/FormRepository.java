package com.api.chillmood.form.persistence;

import com.api.chillmood.form.entity.Form;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface FormRepository extends MongoRepository<Form, String> {
    Form findMoodFormByDate(LocalDate dayDate);
}
