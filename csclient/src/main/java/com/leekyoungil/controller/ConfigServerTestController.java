package com.leekyoungil.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kellin on 4/27/2017.
 */
@Controller
@RequestMapping(value = "/config/test", produces = MediaType.TEXT_HTML_VALUE)
public class ConfigServerTestController {

    @GetMapping
    public String getKeywordFromConfigServer () {
        return "test";
    }
}
