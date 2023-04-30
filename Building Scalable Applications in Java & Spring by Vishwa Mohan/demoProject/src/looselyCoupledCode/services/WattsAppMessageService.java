package looselyCoupledCode.services;

public class WattsAppMessageService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending the wattsapp message : "+ message);
    }
}
