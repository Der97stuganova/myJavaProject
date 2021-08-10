package learn.andersen.school.lessons.lesson4.task8_2;

public class circle extends Shape2D {

    private double r;

    public   circle(double r) {
        this.r = r;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getGirth() {
        return 0;
    }

}
