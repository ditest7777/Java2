package hw1;

public class Treadmill {
    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    public double getTimeToRun(CanRun runner) {
        return runner.run(treadmillLength);
    }

}
