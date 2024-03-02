public class PR20_Interfaces {
    public static void main(String[] args) {
        FourWheeler car = new FourWheeler();
        car.speedLimit();
    }
}

interface Vehicle{
    void speedLimit();
}

class FourWheeler implements Vehicle{
    public void speedLimit(){
        System.out.println("Max speed limit is 300km/h");
    }
}
