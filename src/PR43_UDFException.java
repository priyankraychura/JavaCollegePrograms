public class PR43_UDFException {
    public void myMethod() throws MyException{
        throw new MyException("ERROR!");
    }

    public static void main(String[] args) {
        PR43_UDFException m = new PR43_UDFException();

        try{
            m.myMethod();
        } catch (MyException me){
            System.out.println(me.getErrorMsg());
        }
    }
}

class MyException extends Exception{
    private String errorMsg;

    public MyException(String errorMsg){
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg(){
        return errorMsg;
    }
}