package com.api.chillmood.form.controller;

import com.api.chillmood.form.dto.CreateFormRequest;
import com.api.chillmood.form.dto.FormDto;
import com.api.chillmood.form.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${controller.common.v1}")
@RequiredArgsConstructor
public class CreateFormController {

    private final FormService formService;

    @PostMapping(path = "${controller.form.createForm}")
    public FormDto createForm(@RequestBody CreateFormRequest newMoodForm) {
        //TODO: Test how it works with inner Objects. (list of inner objects)
        return formService.createMoodForm(newMoodForm);
    }

}
