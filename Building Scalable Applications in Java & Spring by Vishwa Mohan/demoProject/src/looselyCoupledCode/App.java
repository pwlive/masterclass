package looselyCoupledCode;

import looselyCoupledCode.services.MessageService;

public class App {
    public static void main(String[] args) {
        MessageServiceFactory messageServiceFactory = new MessageServiceFactory();
        MessageService messageService = messageServiceFactory.getMessageService("wattsApp");
        messageService.sendMessage("Hello World");
    }
}
