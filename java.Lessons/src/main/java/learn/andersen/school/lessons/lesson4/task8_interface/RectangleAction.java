package learn.andersen.school.lessons.lesson4.task8_interface;

import javafx.scene.shape.Circle;
import school.learn.andersen.school.lessons.lesson4. AbstractShape;
import javafx.scene.shape.Rectangle;
import school.learn.andersen.school.lessons.lesson4.ShapeAction;

public class RectangleAction implements ShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof Rectangle rectangle) {
            square = rectangle.getHeight() * rectangle.getWidth();
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return square;
    }
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof Rectangle rectangle) {
            perimeter = 2 * (rectangle.getWidth()
                    + rectangle.getHeight());
        } else {
            throw new IllegalArgumentException("Incompatible shape "
                    + shape.getClass());
        }
        return perimeter;
    }
}