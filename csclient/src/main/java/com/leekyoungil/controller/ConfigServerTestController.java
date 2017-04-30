package com.leekyoungil.controller;

import com.leekyoungil.service.ConfigServerTestDynamicService;
import com.leekyoungil.service.ConfigServerTestStaticService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

/**
 * Created by kellin on 4/27/2017.
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Inject))
@RequestMapping(value = "/config", produces = MediaType.TEXT_HTML_VALUE)
public class ConfigServerTestController {

    private final @NotNull ConfigServerTestStaticService configServerTestStaticService;
    private final @NotNull ConfigServerTestDynamicService configServerTestDynamicService;

    @GetMapping(value = "/static")
    public String getKeywordFromConfigServerByStatic (Model model) {
        model.addAllAttributes(configServerTestStaticService.getTestKeyword());
        return "checkKeyword";
    }

    @GetMapping(value = "/dynamic")
    public String getKeywordFromConfigServerByDynamic (Model model) {
        model.addAllAttributes(configServerTestDynamicService.getTestKeyword());
        return "checkKeyword";
    }
}
