package week13.stepik.javabasic.three;

public class RobotSteps {

    public static void main(String[] args) {
        Robot fancy = new Robot();
        moveRobot(fancy, 12, 10);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        //Узнать текущую координату - X
        int x = robot.getX();
        //Узнать текущую координату - Y
        int y = robot.getY();
        //Узнать направление
        if (x == toX && y == toY){
            return;
        }
        if (robot.getDirection()==Robot.Direction.UP){
            if (x<toX && y<toY){
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
                robot.turnRight();
                while(robot.getX()!=toX){
                    robot.stepForward();
                }
            }
            if (x<toX && y==toY){
                robot.turnRight();
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
            }
            if (x<toX && y>toY){
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
                robot.turnRight();
                while(robot.getX()!=toX){
                    robot.stepForward();
                }
            }
            if (x==toX && y<toY){
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
            }
            if (x==toX && y>toY){

            }
            if (x>toX && y<toY){
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
            }
            if (x>toX && y==toY){
                robot.turnLeft();
                while(robot.getY()!=toY){
                    robot.stepForward();
                }
            }
            if (x>toX && y>toY){

            }
        };
        //Если текущая Х меньше toX, то
            //Если текущее направление Left, 2 раза вызвать поворот вправо
        // поворачивать вправо пока getDirection не станет равным RIGHT
            //Сделать шаг, Х++, если текущая Х меньше toX - повторить
        //Если текущая Х больше toX, то поворачивать влево пока getDirection не станет равным LEFT
            //Сделать шаг, Х--, если текущая Х больше toX - повторить
        //Если текущая Y меньше toY, то поворачивать вправо пока getDirection не станет равным UP
            //Сделать шаг, Y++, если текущая Х больше toX - повторить
        //Если текущая Y больше toY, то поворачивать вправо пока getDirection не станет равным DOWN
            //Сделать шаг, Y--, если текущая Х больше toX - повторить
            //


        robot.stepForward(); // your implementation here
    }

    static class Robot {

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }


        public Direction getDirection() {
            return null;// текущее направление взгляда
        }

        public int getX() {
            return 0;// текущая координата X
        }

        public int getY() {
            return 0;// текущая координата Y
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }
}
