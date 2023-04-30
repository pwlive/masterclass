package looselyCoupledCode.services;


public class TextMessageService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending the text message : "+ message);
    }
}
