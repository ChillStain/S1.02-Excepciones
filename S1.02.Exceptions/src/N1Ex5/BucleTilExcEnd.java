package N1Ex5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BucleTilExcEnd {
    public static void main(String[] args) {
        boolean keepGoing = true;

        while(keepGoing){
            try{
                System.out.println("Add a random number");
                InputStreamReader random = new InputStreamReader(System.in);
                BufferedReader data = new BufferedReader(random);
                String dataString = data.readLine();
                int number = Integer.parseInt(dataString);
                int triangle = ((number * number) / 2);
                System.out.println("The triangle of base " + number + " have an area of "+ triangle + "cm2.\n");
                keepGoing =false;

            }catch (Exception var7){
                System.out.println(var7.getClass());


            }
        }

    }
}
