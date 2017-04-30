package com.leekyoungil.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kellin on 29/04/2017.
 */
@Service
@RefreshScope
public class ConfigServerTestDynamicService {

    @Value("${leekyoungil.said.first}")
    private String first;
    @Value("${leekyoungil.said.second}")
    private String second;

    public Map<String, String> getTestKeyword () {
        Map<String, String> keyword = new HashMap<>();
        keyword.put("first", first);
        keyword.put("second", second);

        return keyword;
    }
}
