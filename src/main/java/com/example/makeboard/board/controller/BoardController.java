package com.example.makeboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
    @GetMapping("/board/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@RequestParam("boardWriter") String boardWriter) {
        return null;
    }

}
