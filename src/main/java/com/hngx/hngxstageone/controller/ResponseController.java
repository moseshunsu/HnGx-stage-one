package com.hngx.hngxstageone.controller;

import com.hngx.hngxstageone.dto.ResponseDto;
import com.hngx.hngxstageone.service.ResponseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResponseController {

    private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping
    public ResponseDto getResponse(@RequestParam("slack_name") String slack_name,
                                   @RequestParam("track") String track) {
        return responseService.getResponse(slack_name, track);
    }

}
