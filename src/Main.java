public class Main {

    public static void main(String[] args){

        CoffeRobot r2d2Coffe = new CoffeRobot();
        RobotCoocker r2d2Coocker = new RobotCoocker();
        RobotDancer r2d2Dancer = new RobotDancer();
        Robot r2d2 = new Robot();

        r2d2.work();
        r2d2Coffe.work();
        r2d2Coocker.work();
        r2d2Dancer.work();

    }

}
