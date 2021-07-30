package com.spring.quiz.restbootquiz.service;

import com.spring.quiz.restbootquiz.entities.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataParsingService implements DataFormat {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Quiz parse(String url) {
        return restTemplate.getForObject(url, Quiz.class);
    }
}
