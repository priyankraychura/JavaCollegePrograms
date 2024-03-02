public class PR18_Shape {
    String name;
    int sides;
    int corners;

    public PR18_Shape(String name, int sides, int corners){
        this.name = name;
        this.sides = sides;
        this.corners = corners;
    }

    public PR18_Shape(){
        this.name = "";
        this.sides = 0;
        this.corners = 0;
    }

    public String getName() {
        return name;
    }

    public int getSides() {
        return sides;
    }

    public int getCorners() {
        return corners;
    }

    public static void main(String[] args) {
        PR18_Shape triangle  = new PR18_Shape("Triangle", 12, 56);
        System.out.println(triangle.getName());
        System.out.println(triangle.getSides());
        System.out.println(triangle.getCorners());
    }
}
