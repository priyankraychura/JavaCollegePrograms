public class PR19_Overriding {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.makeSound();
        System.out.println(dog.toString());

        Cat cat = new Cat("Tom");
        cat.makeSound();
        System.out.println(cat.toString());
    }
}

class Animal{
    private String name;

    public Animal(){
        name = "";
    }

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Makes no sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!!");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
}
