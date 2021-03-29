package hw1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Алиса", 7,1);
        Cat cat = new  Cat("Барсик", 5, 3);
        Robot robot = new Robot("Бендер", 10, 2);

        Treadmill[] treadmills = {new Treadmill(100), new Treadmill(250)};
        Wall[] walls = {new Wall(1), new Wall(3)};

        double humanTime = 0;
        double catTime = 0;
        double robotTime = 0;

        for (Treadmill treadmill : treadmills){
            humanTime = humanTime + treadmill.getTimeToRun(human);
            catTime = catTime + treadmill.getTimeToRun(cat);
            robotTime = robotTime + treadmill.getTimeToRun(robot);
        }

        for (Wall wall : walls){
            humanTime = humanTime + wall.getTimeToJump(human);
            catTime = catTime + wall.getTimeToJump(cat);
            robotTime = robotTime + wall.getTimeToJump(robot);
        }

        System.out.println("Время человека: " + humanTime);
        System.out.println("Время кота: " + catTime);
        System.out.println("Время робота: " + robotTime);
    }
}
