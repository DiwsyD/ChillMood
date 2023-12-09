package com.api.chillmood.repository;

import com.api.chillmood.entity.MoodForm;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface MoodFormRepository extends MongoRepository<MoodForm, String> {
    MoodForm findMoodFormByDate(Date dayDate);
}
