import java.util.ArrayList;

public class PR39_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);

        cars.remove(1);
        System.out.println(cars);
    }
}
