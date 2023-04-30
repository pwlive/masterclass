package com.vishwa.learnspring.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextMessageService implements MessageService {

    @Autowired
    @Qualifier("timeService12HourFormat")
    TimeService timeService;


    @Override
    public void sendMessage(String message) {
        System.out.println("Sending the text message : "+ message + " at : "+ timeService.getCurrentTime());
    }

    public TimeService getTimeService() {
        return timeService;
    }
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }
}
