package com.api.chillmood.form.controller;

import com.api.chillmood.form.dto.CreateFormRequest;
import com.api.chillmood.form.dto.FormDto;
import com.api.chillmood.form.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${controller.common.v1}")
@RequiredArgsConstructor
public class UpdateFormController {

    private final FormService formService;

    @PatchMapping(path = "${controller.form.updateForm}")
    public FormDto updateForm(@RequestBody CreateFormRequest newMoodForm) {
        return null;
    }

}
