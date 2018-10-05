package week13.stepik.javabasic.three;

import java.math.*;
import java.util.Arrays;

public class RobotSteps {


    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -10, 20);
        System.out.println(robot.getX()==-10 && robot.getY()==20);
    }

    public static int abs(int x) {
        if (x < 0) {
            x = x * (-1);
        }
        return x;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        //Узнать текущую координату - X
        int x = robot.getX();
        //Узнать текущую координату - Y
        int y = robot.getY();
        //количество шагов до X;
        int wayX = abs(x - toX);
        //количество шагов до Y;
        int wayY = abs(y - toY);

        //Робот уже на месте
        if (wayX == 0 && wayY == 0) {
            return;
        }
        //Робот смотрит вверх
        if (robot.getDirection() == Direction.UP) {
            if (x < toX && y < toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y == toY) {
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y > toY) {
                robot.turnRight();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y < toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y > toY) {
                robot.turnRight();
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y < toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnLeft();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y == toY) {
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y > toY) {
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
        }
        //Робот смотрит влево
        if (robot.getDirection() == Direction.LEFT) {
            if (x < toX && y < toY) {
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y == toY) {
                robot.turnRight();
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y > toY) {
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnLeft();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x == toX && y < toY) {
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y > toY) {
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y < toY) {
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y == toY) {
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y > toY) {
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
        }
        //Робот смотрит вниз
        if (robot.getDirection() == Direction.DOWN) {
            if (x < toX && y < toY) {
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x < toX && y == toY) {
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y > toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnLeft();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x == toX && y < toY) {
                robot.turnRight();
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y > toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y < toY) {
                robot.turnLeft();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y == toY) {
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y > toY) {
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnLeft();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
        }
        //Робот смотрит вправо
        if (robot.getDirection() == Direction.RIGHT) {
            if (x < toX && y < toY) {
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x < toX && y == toY) {
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x < toX && y > toY) {
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y < toY) {
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x == toX && y > toY) {
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                return;
            }
            if (x > toX && y < toY) {
                robot.turnLeft();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnLeft();
                while (wayX != toX) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y == toY) {
                robot.turnRight();
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
            if (x > toX && y > toY) {
                robot.turnRight();
                while (wayY != 0) {
                    robot.stepForward();
                    wayY--;
                }
                robot.turnRight();
                while (wayX != 0) {
                    robot.stepForward();
                    wayX--;
                }
                return;
            }
        }
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
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }
}
