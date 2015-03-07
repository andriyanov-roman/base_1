package Cycles;


public class CycleHappyTicket {
    public static void main(String[] args) {
        int i, count = 0, sumLeft = 0, sumRight = 0;
        for (i = 000001; i < 1000000; i++) {
            sumLeft = ((i / 100000) + ((i / 10000) % 10)) + ((i / 1000) % 10);
            sumRight = ((i % 10) + ((i / 10) % 10) + ((i / 100) % 10));
            if (sumLeft == sumRight)
                count++;
        }
        System.out.println("Количество счастливых билетов: " + count);

    }
}
