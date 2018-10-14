package week14.stepik.javabase.four.robotexeption;

public class RobotExeption {

    public static void main(String[] args) {
        int toX = -10;
        int toY = -20;
        Robot robot = new Robot(0, 0, Direction.UP);
        System.out.println("Start position: x = " + robot.getX() + ", y = " + robot.getY());
        moveRobot(robot, toX, toY);
        System.out.println("End position: x = " + robot.getX() + ", y = " + robot.getY());
        System.out.println(robot.getX() == toX && robot.getY() == toY);

        robot = new Robot(0, 0, Direction.DOWN);
        System.out.println("Start position: x = " + robot.getX() + ", y = " + robot.getY());
        moveRobot(robot, toX, toY);
        System.out.println("End position: x = " + robot.getX() + ", y = " + robot.getY());
        System.out.println(robot.getX() == toX && robot.getY() == toY);

        robot = new Robot(0, 0, Direction.LEFT);
        System.out.println("Start position: x = " + robot.getX() + ", y = " + robot.getY());
        moveRobot(robot, toX, toY);
        System.out.println("End position: x = " + robot.getX() + ", y = " + robot.getY());
        System.out.println(robot.getX() == toX && robot.getY() == toY);

        robot = new Robot(0, 0, Direction.RIGHT);
        System.out.println("Start position: x = " + robot.getX() + ", y = " + robot.getY());
        moveRobot(robot, toX, toY);
        System.out.println("End position: x = " + robot.getX() + ", y = " + robot.getY());
        System.out.println(robot.getX() == toX && robot.getY() == toY);
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
/*        boolean connectionOk = false;
        try (RobotConnection connection = robotConnectionManager.getConnection()) {
            connection.moveRobotTo(toX, toY);
            connectionOk = true;
        } catch (RobotConnectionException e1) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                connectionOk = true;
            } catch (RobotConnectionException e2) {
                try (RobotConnection connection = robotConnectionManager.getConnection()) {
                    connection.moveRobotTo(toX, toY);
                    connectionOk = true;
                } catch (RobotConnectionException e3) {
                }
            }
        }
        if (!connectionOk) {
            throw new RobotConnectionException("3 attempts exhausted");
        }*/

        boolean connectionOk = false;
        for (int attempt = 0; !connectionOk && attempt < 3; attempt++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                connectionOk = true;
            } catch (RobotConnectionException e) {
            }
            if (connectionOk) {
                return;
            }
        }
        throw new RobotConnectionException("3 attempts exhausted");
    }


    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    static class Robot implements RobotConnection, RobotConnectionManager {
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

        @Override
        public void moveRobotTo(int x, int y) {

        }

        @Override
        public void close() {

        }

        @Override
        public RobotConnection getConnection() {
            return null;
        }
    }
}
