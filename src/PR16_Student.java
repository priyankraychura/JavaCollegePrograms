public class PR16_Student {

    int id;
    String stream;

    public void setId(int i){
        id = i;
    }
    public void setStream(String s){
        stream = s;
    }
    public int getId() {
        return id;
    }
    public String getStream() {
        return stream;
    }

    public static void main(String[] args) {
        PR16_Student s = new PR16_Student();
        s.setStream("BCA");
        s.setId(21);
        System.out.println(s.getStream());
        System.out.println(s.getId());
    }
}
