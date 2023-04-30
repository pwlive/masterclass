package com.vishwa.learnspring;


import com.vishwa.learnspring.services.MessageService;
import com.vishwa.learnspring.services.TextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.vishwa.learnspring");
        MessageService messageService = (TextMessageService)applicationContext.getBean("textMessageService");
        messageService.sendMessage("Hello World");
    }
}
