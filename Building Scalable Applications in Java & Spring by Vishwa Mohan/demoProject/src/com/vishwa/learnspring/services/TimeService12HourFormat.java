package com.vishwa.learnspring.services;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService12HourFormat implements TimeService {
    @Override
    public int getCurrentTime() {
        int hour = LocalDateTime.now().getHour();
        return hour > 12 ? hour - 12 : hour;
    }
}