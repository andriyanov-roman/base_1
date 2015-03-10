package loop;


public class CycleClockMinutesHours {
    public static void main(String[] args) {
        int i, j, count = 0;
        for (i = 0; i < 24; i++) {
            for (j = 0; j < 60; j++) {
                if ((i / 10) == (j % 10) && (i % 10) == (j / 10))
                    count++;// Количество совпадений
            }
        }


    }
}
