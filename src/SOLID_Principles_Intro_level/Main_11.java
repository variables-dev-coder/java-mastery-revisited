package SOLID_Principles_Intro_level;

// Interface Segregation Principle (ISP)

// Example 2: Employee Work Management

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}

class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

public class Main_11 {

    public static void main(String[] args) {

        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
    }
}
