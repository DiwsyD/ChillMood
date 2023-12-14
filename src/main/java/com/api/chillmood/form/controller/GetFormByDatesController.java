package com.api.chillmood.form.controller;

import com.api.chillmood.form.dto.FormDto;
import com.api.chillmood.form.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "${controller.common.v1}")
@RequiredArgsConstructor
public class GetFormByDatesController {

    private final FormService formService;

    @GetMapping(path = "${controller.form.getFormByDay}")
    public FormDto getMoodFormByDay(@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate day) {
        System.out.println("Date: " + day.getClass());

        return null;
    }

    @GetMapping(path = "${controller.form.getFormByDateRange}")
    public FormDto getFormByDateRange(
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate from,
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate to
    ) {
        System.out.printf("From: %tF - To: %tF ", from, to);

        return null;
    }
}
