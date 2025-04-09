package ex.section13;

public class SmsSender implements Sender{
    @Override
    public void senderMessage(String msg) {
        System.out.println("SMS를 발송합니다: " + msg);
    }
}
