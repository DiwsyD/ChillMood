package com.api.chillmood.controller;

import com.api.chillmood.dto.CreateMoodFormDto;
import com.api.chillmood.dto.MoodFormDto;
import com.api.chillmood.service.MoodFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "api/v1/moodform")
public class MoodFormController {

    private final MoodFormService moodFormService;

    @Autowired
    public MoodFormController(MoodFormService moodFormService) {
        this.moodFormService = moodFormService;
    }

    //https://www.baeldung.com/get-user-in-spring-security
    @GetMapping
    public MoodFormDto getMoodFormByDay(@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate day) {
        System.out.println("Date: " + day.getClass());

        return null;
        //return moodFormService.getMoodFormByDate(userId, dayDate);
    }
    //https://www.baeldung.com/get-user-in-spring-security
    @GetMapping
    public MoodFormDto getMoodFormByDateRange(
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate from,
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate to
    ) {
        System.out.printf("From: %tF - To: %tF ", from, to);

        return null;
        //return moodFormService.getMoodFormByDate(userId, dayDate);
    }

    @PostMapping
    public MoodFormDto createMoodForm(@RequestBody CreateMoodFormDto newMoodForm) {
        //TODO: Test how it works with inner Objects. (list of inner objects)
        return moodFormService.createMoodForm(newMoodForm);
    }

    @PatchMapping
    public MoodFormDto updateMoodForm(@RequestBody CreateMoodFormDto newMoodForm) {
        return null;
    }

}
