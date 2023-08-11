public class Main {
    public static void main(String[] args) {
        MessagingService sms = new smsMessagingService();
        MessagingService email = new emailMessageService();
        MessagingService wht = new emailMessageService();

        sms.sendmessage();
        email.sendmessage();
        wht.sendmessage();
    }

}
interface MessagingService{
    void sendmessage();

}
class smsMessagingService implements MessagingService {
    public void sendmessage()
    {
        System.out.println("Sending SMS message");
    }

}
class emailMessageService implements MessagingService{
    public void sendmessage() {
        System.out.println("sending Email message");
    }

}
class whatsappMessageService implements MessagingService
{
    public void sendmessage()
    {
        System.out.println("sending Whatsapp message");
    }
}