package com.hngx.hngxstageone.service.impl;

import com.hngx.hngxstageone.dto.ResponseDto;
import com.hngx.hngxstageone.service.ResponseService;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class ResponseServiceImpl implements ResponseService {

    @Override
    public ResponseDto getResponse(String slack_name, String track) {
        LocalDate today = LocalDate.now();
        Instant instant = Instant.now();
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);

        DayOfWeek currentDay = today.getDayOfWeek();

        return ResponseDto.builder()
                .slack_name(slack_name)
                .current_day(currentDay.name())
                .utc_time(now.toString())
                .track(track)
                .github_file_url("https://github.com/moseshunsu/hngx-stage-one/blob/main/src/main/java/com/hngx/hngxstageone/HngxStageOneApplication.java")
                .github_repo_url("https://github.com/moseshunsu/HnGx-stage-one")
                .status_code(200)
                .build();
    }

}
