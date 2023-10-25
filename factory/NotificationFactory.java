package factory;
public class NotificationFactory {
    public Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        if("SMS".equals(type)){
            return new SMSNotification();
        }
        else if("Email".equals(type)){
            return new EmailNotification();
        }
        else if ("Push".equals(type)){
            return new PushNotification();
        }
        else        return null;
    }
    
}
