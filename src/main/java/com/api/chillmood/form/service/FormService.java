package com.api.chillmood.form.service;

import com.api.chillmood.form.dto.CreateFormRequest;
import com.api.chillmood.form.dto.FormDto;
import com.api.chillmood.form.entity.Form;
import com.api.chillmood.form.persistence.FormRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class FormService {
    /**
     * All forms could be retrieved by any parameters only with userId in request.
     */
    private final FormRepository formRepository;

    //Retrieve MoodForm for the given date (day)
    public FormDto getMoodFormByDate(String userId, LocalDate dayDate) {
        return mapFormToFormDto(formRepository.findMoodFormByDate(dayDate));
    }

    //Retrieve MoodForm for the given date range (e.g. month)
    public List<FormDto> getMoodFormsInDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    public FormDto createMoodForm(CreateFormRequest newForm) {
        // Also, validate the DTO.
        log.traceEntry("enter with request new form", newForm);
        Form form = mapCreateFormToForm(newForm);
        Form savedForm = formRepository.save(form);
        FormDto newFormDto = mapFormToFormDto(savedForm);
        return log.traceExit("exit with: ", newFormDto);
    }

    //Bean mappper?
    private Form mapCreateFormToForm(CreateFormRequest newForm) {
        return Form.builder()
                .date(LocalDate.now())
                //.logParameters()
                .steps(newForm.getSteps())
                .sleepStart(newForm.getSleepStart())
                .sleepEnd(newForm.getSleepEnd())
                .highlights(newForm.getHighlights())
                .build();
    }

    private FormDto mapFormToFormDto(Form form) {
        return FormDto.builder()
                .date(form.getDate())
                .logParameter(form.getLogParameters())
                .steps(form.getSteps())
                .sleepStart(form.getSleepStart())
                .sleepEnd(form.getSleepEnd())
                .highlights(form.getHighlights())
                .build();
    }

}
