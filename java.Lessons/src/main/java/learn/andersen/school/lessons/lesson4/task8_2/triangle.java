package learn.andersen.school.lessons.lesson4.task8_2;

public class triangle extends Shape2D {

    private double a;
    private double b;
    private double c;

    public triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getCircumference() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getGirth() {
        return 0;
    }

}
