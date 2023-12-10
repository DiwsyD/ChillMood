package com.api.chillmood.service;

import com.api.chillmood.dto.CreateMoodFormDto;
import com.api.chillmood.dto.MoodFormDto;
import com.api.chillmood.entity.MoodForm;
import com.api.chillmood.repository.MoodFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MoodFormService {
    /**
     * All forms could be retrieved by any parameters only with userId in request.
     * */
    private final MoodFormRepository moodFormRepository;

    @Autowired
    public MoodFormService(MoodFormRepository moodFormRepository) {
        this.moodFormRepository = moodFormRepository;
    }

    //Retrieve MoodForm for the given date (day)
    public MoodFormDto getMoodFormByDate(String userId, LocalDate dayDate) {
        return null;//moodFormRepository.findMoodFormByDate(userId, dayDate);
    }

    //Retrieve MoodForm for the given date range (month)
    public List<MoodFormDto> getMoodFormsInDateRange(String userId, LocalDate from, LocalDate to) {
        return null;
    }

    public MoodFormDto createMoodForm(CreateMoodFormDto newMoodForm) {
        // Also, validate the DTO.
        MoodForm moodForm = mapCreateMoodFormToMoodForm(newMoodForm);
        MoodForm savedMoodForm = moodFormRepository.save(moodForm);
        return mapMoodFormToMoodFormDto(savedMoodForm);
    }

    //Bean mappper
    private MoodForm mapCreateMoodFormToMoodForm(CreateMoodFormDto newMoodForm) {
        MoodForm moodForm = new MoodForm();
        moodForm.setDate(LocalDate.now());
        //nMoodForm.setLogParameters();
        moodForm.setSteps(newMoodForm.getSteps());
        moodForm.setSleepStart(newMoodForm.getSleepStart());
        moodForm.setSleepEnd(newMoodForm.getSleepEnd());
        moodForm.setHighlights(newMoodForm.getHighlights());
        return moodForm;
    }

    private MoodFormDto mapMoodFormToMoodFormDto(MoodForm moodForm) {
        return MoodFormDto.builder()
                .date(moodForm.getDate())
                .logParameter(moodForm.getLogParameters())
                .steps(moodForm.getSteps())
                .sleepStart(moodForm.getSleepStart())
                .sleepEnd(moodForm.getSleepEnd())
                .highlights(moodForm.getHighlights())
                .build();
    }

}
