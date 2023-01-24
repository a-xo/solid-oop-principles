package open_closed.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {
    @Test
    public void itShouldCalculateAreOfSquare() {
        Shape square = new Square(2.0);
        assertEquals(4.0, AreaCalculator.calculateArea(square));
    }

    @Test
    public void itShouldCalculateAreOfCircle() {
        Shape circle = new Circle(5.0);
        assertEquals(78.53981633974483, AreaCalculator.calculateArea(circle));
    }

    @Test
    public void itShouldCalculateAreOfRectangle() {
        Shape rectangle = new Rectangle(2.0, 3.0);
        assertEquals(6.0, AreaCalculator.calculateArea(rectangle));
    }
    @Test
    public void itShouldCalculateAreOfTriangle() {
        Shape triangle = new Triangle(6.0, 3.0, 5.2);
        assertEquals(7.799993589740953, AreaCalculator.calculateArea(triangle));
    }

//    @Test
//    public void itShouldCalculateAreOfHexagon() {
//        Shape hexagon = new Hexagon();
//        assertEquals(, AreaCalculator.calculateArea(triangle));
//    }
}