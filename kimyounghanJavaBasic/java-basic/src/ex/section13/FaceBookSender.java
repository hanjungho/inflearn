package ex.section13;

public class FaceBookSender implements Sender{
    @Override
    public void senderMessage(String msg) {
        System.out.println("페이스북에 발송합니다: " + msg);
    }
}
