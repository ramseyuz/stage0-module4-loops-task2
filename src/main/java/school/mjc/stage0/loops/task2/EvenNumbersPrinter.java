package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 1;
        while (counter <= printTillInclusive) {
            int a = counter % 2;
            if (a == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
