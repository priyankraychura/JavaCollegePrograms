public class PR17_Person {
    private String name;
    private int age;

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        PR17_Person p = new PR17_Person();
        p.setName("Priyank");
        p.setAge(18);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}
