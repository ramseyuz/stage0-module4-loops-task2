package school.mjc.stage0.loops.task2;

import static java.lang.Math.abs;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive != 0) {
            while (counter <= abs(multiplyByAndToInclusive)) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
