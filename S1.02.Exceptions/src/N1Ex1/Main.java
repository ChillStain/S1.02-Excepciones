package N1Ex1;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("Exception on try");
        }catch(Exception e){
            System.out.println("The following exception ocurred: "+e.getMessage());
            System.out.println("Kind of exception: "+e.getClass());
        }
        finally{
            System.out.println("Despite the exception we passed through here");

        }

    }
}
