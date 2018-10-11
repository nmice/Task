package week14.stepik.javabase.four.robotexeption;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}
