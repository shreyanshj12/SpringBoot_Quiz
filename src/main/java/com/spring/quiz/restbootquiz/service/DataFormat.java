package com.spring.quiz.restbootquiz.service;

import com.spring.quiz.restbootquiz.entities.Quiz;

// import java.util.List;

public interface DataFormat {

    Quiz parse(String url);
}
