package hw1;

public class Members  {
    private String name;
    private int runSpeed;
    private int jumpHeight;

    public Members() {
    }

    public Members(String name, int runSpeed, int jumpHeight) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.jumpHeight = jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }


}
