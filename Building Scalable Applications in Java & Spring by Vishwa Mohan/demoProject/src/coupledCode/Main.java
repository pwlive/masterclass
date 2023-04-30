package coupledCode;

import coupledCode.services.TextMessageService;

public class Main {
    public static void main(String[] args) {
        TextMessageService messageService = new TextMessageService();

        messageService.sendMessage("Hello World");
    }
}
