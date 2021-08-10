package learn.andersen.school.lessons.lesson4.task8_interface;

import javafx.scene.shape.Circle;
import school. learn.andersen.school.lessons.lesson4.AbstractShape;
import javafx.scene.shape.Rectangle;
import school.learn.andersen.school.lessons.lesson4.ShapeAction;

public class TriangleAction implements ShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof RightTriangle triangle) {
            square = 1./2 * triangle.getSideA() * triangle.getSideB();
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return square;
    }
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter = 0;
        if (shape instanceof RightTriangle triangle) {
            double a = triangle.getSideA();
            double b = triangle.getSideB();
            perimeter = a + b + Math.hypot(a, b);
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return perimeter;
    }
}
