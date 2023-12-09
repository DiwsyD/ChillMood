package com.api.chillmood.controller;

import com.api.chillmood.dto.MoodFormDTO;
import com.api.chillmood.entity.MoodForm;
import com.api.chillmood.service.MoodFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "api/v1/moodform")
public class MoodFormController {

    private final MoodFormService moodFormService;

    @Autowired
    public MoodFormController(MoodFormService moodFormService) {
        this.moodFormService = moodFormService;
    }

    public MoodForm getMoodForm(Date dayDate) {

        return moodFormService.getMoodFormByDate(dayDate);
    }

    public MoodForm createMoodForm(@RequestBody MoodFormDTO newMoodForm) {
        //TODO: Test how it works with inner Objects. (list of inner objects)
        return moodFormService.createMoodForm(newMoodForm);
    }

}
