interface Vehicle2{
    void move();
}

interface Sound{
    void makeSound();
}

class Car implements Vehicle2{
    @Override
    public void move() {
        System.out.println("Car moves!");
    }
}

class Truck implements Vehicle2{
    @Override
    public void move() {
        System.out.println("Truck moves!");
    }
}

class Bike implements Vehicle2{
    @Override
    public void move() {
        System.out.println("Bike moves!");
    }
}

class EnglineSound implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Vroom!");
    }
}

class Bell implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Ding!");
    }
}


public class PR55_BridgeClass {
}
