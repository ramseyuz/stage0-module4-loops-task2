package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        int value;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (counter <= power) {
                value = (int) Math.pow(2, counter);
                System.out.println(value);
                counter++;

            }
        }
    }
}
