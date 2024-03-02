public class PR22_AbstractAndFinal {
    public static void main(String[] args) {
        Circle c1 = new Circle(9);
        System.out.println(c1.calculateArea());

        Square s1 =  new Square(5);
        System.out.println(s1.calculateArea());

    }
}

abstract class Shape{
    public abstract double calculateArea();
}

final class Circle extends Shape{
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

final class Square extends Shape{
    private final int length;

    public Square(int length){
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}