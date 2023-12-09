package com.api.chillmood.service;

import com.api.chillmood.dto.MoodFormDTO;
import com.api.chillmood.entity.MoodForm;
import com.api.chillmood.repository.MoodFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MoodFormService {

    private final MoodFormRepository moodFormRepository;

    @Autowired
    public MoodFormService(MoodFormRepository moodFormRepository) {
        this.moodFormRepository = moodFormRepository;
    }

    public MoodForm getMoodFormByDate(Date dayDate) {
        return moodFormRepository.findMoodFormByDate(dayDate);
    }

    public MoodForm createMoodForm(MoodFormDTO newMoodForm) {
        //TODO: Reminder: DTO does not have date of creation;
        // Also, validate the DTO.
        MoodForm nMoodForm = new MoodForm();
        nMoodForm.setDate(new Date());
        //nMoodForm.setLogParameters();
        nMoodForm.setSteps(newMoodForm.getSteps());
        nMoodForm.setSleepStart(newMoodForm.getSleepStart());
        nMoodForm.setSleepEnd(newMoodForm.getSleepEnd());
        nMoodForm.setHighlights(newMoodForm.getHighlights());
        return moodFormRepository.save(nMoodForm);
    }
}
