package com.spring.quiz.restbootquiz.entities;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    // private int response_code;

    // private List<Quiz> quiz = new ArrayList<Quiz>();
    private List<Result> results = new ArrayList<Result>();

    // public String getQuiz() {
    // return quiz;
    // }

    // public void setQuiz(String quiz) {
    // this.quiz = quiz;
    // }

    // public List<Quiz> getQuiz() {
    // return quiz;
    // }

    // public void setQuiz(List<Quiz> quiz) {
    // this.quiz = quiz;
    // }

    // public int getResponse_code() {
    // return response_code;
    // }

    // public void setResponse_code(int response_code) {
    // this.response_code = response_code;
    // }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Quiz [quiz=" + ", results=" + results + "]";
    }

}
