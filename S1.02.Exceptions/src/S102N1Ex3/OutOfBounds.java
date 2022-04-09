package S102N1Ex3;

public class OutOfBounds {
    static String messages[] = {"\n(●'◡'●)\n","\n^_^\n","\n(╯°□°)\n"};

    public static void main(String[] args) {
        try{
            for(int i=0; 1<=3; i++)
                System.out.println(messages[i]);
        }catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println(" Huh!!! that shxxxx is overloading.\n");
        }
        System.out.println("The execution is already done Joan.");
    }

    }
