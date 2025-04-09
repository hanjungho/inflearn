package ex.section13;

public class EmailSender implements Sender{
    @Override
    public void senderMessage(String msg) {
        System.out.println("메일을 발송합니다: " + msg);
    }
}
