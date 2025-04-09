package inflearn.kimyounghanstart.section04;

public class GradeSwitchEx {

    public static void main(String[] args) {
        String grade = "A";

//        switch (grade) {
//            case "A":
//                System.out.println("탁월한 성과입니다!");
//                break;
//            case "B":
//                System.out.println("좋은 성과입니다!");
//                break;
//            case "C":
//                System.out.println("준수한 성과입니다!");
//                break;
//            case "D":
//                System.out.println("향상이 필요합니다.");
//                break;
//            case "F":
//                System.out.println("불합격입니다.");
//                break;
//            default:
//                System.out.println("잘못된 학점입니다.");

        String txt = switch (grade) {
            case "A" -> "탁월한 성과입니다!";
            case "B" -> "좋은 성과입니다!";
            case "C" -> "준수한 성과입니다!";
            case "D" -> "향상이 필요합니다.";
            case "F" -> "불합격입니다.";
            default -> "잘못된 학점입니다.";
        };

        System.out.println(txt);
    }
}
