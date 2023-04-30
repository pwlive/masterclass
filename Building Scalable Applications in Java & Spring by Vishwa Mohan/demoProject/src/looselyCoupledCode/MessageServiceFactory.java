package looselyCoupledCode;

import looselyCoupledCode.services.MessageService;
import looselyCoupledCode.services.TextMessageService;
import looselyCoupledCode.services.WattsAppMessageService;

public class MessageServiceFactory {

    public MessageService getMessageService (String serviceType){

        if(serviceType.equals("text")){
            return new TextMessageService();
        }else if(serviceType.equals("wattsApp")){
            return new WattsAppMessageService();
        }else{
            throw new RuntimeException("No such message service exists");
        }
    }
}
