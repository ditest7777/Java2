package hw1;

public class Cat extends Members implements CanRun, CanJump{

    public Cat(String name, int runSpeed, int jumpHeight) {
        super(name, runSpeed, jumpHeight);
    }

    @Override
    public double jump(int height) {
        return super.getJumpHeight() * height;
    }

    @Override
    public double run(int length) {
        return super.getRunSpeed() * length;
    }
}
