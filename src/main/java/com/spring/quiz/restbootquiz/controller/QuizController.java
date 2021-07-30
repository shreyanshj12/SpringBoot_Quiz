package com.spring.quiz.restbootquiz.controller;

// import java.util.ArrayList;
// import java.util.List;

import com.spring.quiz.restbootquiz.entities.Quiz;
import com.spring.quiz.restbootquiz.service.DataFormat;

import org.json.JSONObject;
// import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// import org.springframework.web.client.RestTemplate;
//import com.google.gson.Gson;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class QuizController {

    private static final String url1 = "https://opentdb.com/api.php?amount=5&category=11";
    private static final String url2 = "https://opentdb.com/api.php?amount=5&category=12";
    @Autowired
    private DataFormat dataFormat;

    @RequestMapping(value = "/quiz", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> fun() {
        Quiz quiz1;
        Quiz quiz2;
        quiz1 = (Quiz) this.dataFormat.parse(url1);
        quiz2 = (Quiz) this.dataFormat.parse(url2);

        JSONObject jso1 = new JSONObject(quiz1);
        JSONObject jso2 = new JSONObject(quiz2);
        // JSONObject Obj1 = (JSONObject) jso1.get("quiz1");
        // JSONObject Obj2 = (JSONObject) jso2.get("quiz2");
        JSONObject combined = new JSONObject();
        combined.put("quiz", jso1);
        combined.put("quiz1", jso2);

        System.out.println(combined);
        // return combined;

        return ResponseEntity.status(HttpStatus.OK).body(combined.toString());

        // return ResponseEntity.of(Optional.of(combined));
        // return Response.ok(combined, MediaType.APPLICATION_JSON).build();
        // return quiz1;
    }

}
