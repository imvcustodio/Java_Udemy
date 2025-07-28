package entites;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void maiorTriangle(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Area of triangle A > areaB");
        }else{
            System.out.println("Area of triangle B  > areaA");
        }
    }
}
