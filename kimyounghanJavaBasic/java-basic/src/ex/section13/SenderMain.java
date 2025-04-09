package ex.section13;

public class SenderMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.senderMessage("환영합니다!");
        }
    }
}
