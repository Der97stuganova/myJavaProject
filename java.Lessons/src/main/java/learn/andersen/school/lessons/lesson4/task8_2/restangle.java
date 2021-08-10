package learn.andersen.school.lessons.lesson4.task8_2;

public class restangle extends Shape2D {

    private double  a;
    private double  b;

    public restangle(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public double getCircumference() {
        return 2*(a+b);
    }
    public double getArea() {
        return a*b;
    }
    public double getGirth() {
        return 0;
    }


}
