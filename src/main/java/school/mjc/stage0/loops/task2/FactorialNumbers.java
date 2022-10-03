package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int countLowest = 0;
        int value = 1;


        while (countLowest <= printToInclusive) {
            if (countLowest == 0)
                value = value * (countLowest + 1);
            else
                value = value * countLowest;
            countLowest++;
            System.out.println(value);
        }

    }
}
