package com.spring.quiz.restbootquiz.entities;

import java.util.ArrayList;
import java.util.List;

public class QuizData {
    private List<Result> results = new ArrayList<Result>();

    @Override
    public String toString() {
        return "QuizData [results=" + results + "]";
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    // public List<Result> getResults() {
    // return results;
    // }

    // public void setResults(List<Result> results) {
    // this.results = results;
    // }

}
