package com.ai.gemini_chat.controller;

import com.ai.gemini_chat.service.QnaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/api/qna")
public class AiController {

    private final QnaService qnaService;


    public ResponseEntity<String> askQuestion(@RequestBody Map<String,String> payload){

        String question = payload.get("question");
        String answer =  qnaService.getAnswer(question);
        return ResponseEntity.ok(answer);
    }
}
