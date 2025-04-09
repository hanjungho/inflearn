package ex.section07;

public class MaxCounter {
    int count;
    int max;

    MaxCounter(int max) {
        count = 0;
        this.max = max;
    }

    void increment() {
        if (max <= count) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    int getCount() {
        return count;
    }
}
