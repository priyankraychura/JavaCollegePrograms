public class PR21_ObjCloning {
    public static void main(String[] args) {
        Balloon b1 = new Balloon("red");
        Balloon b2 = null;
        try {
            b2 = (Balloon) b1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        b1.setColor("Yellow");
        System.out.println(b1.getColor());  // Output: Yellow
        System.out.println(b2.getColor());  // Output: Yellow
    }
}

class Balloon implements Cloneable {
    private String color;

    public Balloon(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Create a shallow copy of the Balloon object
        return super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
