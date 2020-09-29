// https://www.spoj.com/problems/SMPWOW/
// Spoj 

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner skaner = new Scanner(System.in);

        String number_string = skaner.nextLine();
        int number = Integer.parseInt(number_string);
        skaner.close();

        String os = "";

        if (number > 0 && number < 50) {
            for(int i = 0; i<number; i++){
                os = os + "o";
            }
        }
        
        System.out.println("W"+ os + "w");
    }
}
