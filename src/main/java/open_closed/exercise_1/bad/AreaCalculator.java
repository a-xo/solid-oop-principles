package open_closed.exercise_1.bad;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
//this class becomes an anti-pattern Polter-Geist
public class AreaCalculator {
    public static double calculateArea(Shape shape) {
        return shape.getArea();
    }
}
