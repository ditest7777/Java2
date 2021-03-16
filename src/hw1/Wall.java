package hw1;

public class Wall {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public double getTimeToJump(CanJump jumper) {
        return jumper.jump(wallHeight);
    }
}
