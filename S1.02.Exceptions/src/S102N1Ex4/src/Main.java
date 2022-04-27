public class Main {

    public static void main(String[]args) {

        try {
            throw new MyException("My own Exception");
        } catch(MyException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Exception type:"+e.getClass());
        }
    }
}