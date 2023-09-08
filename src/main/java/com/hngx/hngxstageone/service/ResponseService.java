package com.hngx.hngxstageone.service;

import com.hngx.hngxstageone.dto.ResponseDto;

public interface ResponseService {
    ResponseDto getResponse(String slack_name, String track);
}
