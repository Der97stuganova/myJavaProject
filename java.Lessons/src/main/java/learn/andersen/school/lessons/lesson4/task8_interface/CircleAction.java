package learn.andersen.school.lessons.lesson4.task8_interface;

package learn.andersen.school.lessons.lesson4;
import javafx.scene.shape.Circle;
import school.learn.andersen.school.lessons.lesson4. AbstractShape;
import school. learn.andersen.school.lessons.lesson4.Rectangle;
import school.learn.andersen.school.lessons.lesson4. ShapeAction;


public class СircleAction implements ShapeAction {
    private double r;
    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instance of; Circle circle) {
            square =  2*Math.PI*r;
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return square;
    }
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof Circle circle) {
            perimeter =Math.PI*r*r;
        } else {
            throw new IllegalArgumentException("Incompatible shape "
                    + shape.getClass());
        }
        return perimeter
    }
}